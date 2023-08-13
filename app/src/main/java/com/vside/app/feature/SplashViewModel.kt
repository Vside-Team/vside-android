package com.vside.app.feature

import com.vside.app.R
import com.depayse.data.repository.AuthRepositoryImpl
import com.vside.app.util.base.BaseViewModel
import com.vside.app.util.common.handleApiResponse

class SplashViewModel(private val authRepository: AuthRepositoryImpl): BaseViewModel() {
    val gifRawResId = R.raw.splash

    suspend fun signIn(
        loginType: String?,
        snsId: String?,
        onOurUser: (jwtBearer: String?) -> Unit,
        onNewUser: () -> Unit,
        onPostFail: () -> Unit
    ) {
        authRepository.signIn(loginType, snsId)
            .collect { response ->
                handleApiResponse(
                    response = response,
                    onSuccess = {
                        if(it.data?.isOurUser == true) {
                            onOurUser(it.data?.jwtBearer)
                        }
                        else {
                            onNewUser()
                        }
                    },
                    onException = {
                        onPostFail()
                    },
                    onError = {
                        onPostFail()
                    }
                )
            }
    }
}
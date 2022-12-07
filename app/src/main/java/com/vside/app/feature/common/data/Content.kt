package com.vside.app.feature.common.data

import com.google.gson.annotations.SerializedName
import java.math.BigInteger

data class Content(
    @SerializedName("contentId") val contentId: BigInteger?,
    @SerializedName("title") val title: String?,
    @SerializedName("imgUrl") val imgUrl: String?,
    @SerializedName("mainKeyword") val mainKeyword: String?,
    @SerializedName("darkerColor") val darkerColor: String?,
    @SerializedName("lighterColor") val lighterColor: String?,
    @SerializedName("contentUrl") val contentUrl: String?,
    @SerializedName("scrap") val isBookmark: Boolean?,
    @SerializedName("isLightBg") val isLightBg: Boolean?
)

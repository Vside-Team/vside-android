package com.vside.app.feature.filter.data.response

import com.google.gson.annotations.SerializedName
import com.vside.app.feature.common.data.Content

data class FilteredContentResponse(
    @SerializedName("contents") val contents: List<Content>
)
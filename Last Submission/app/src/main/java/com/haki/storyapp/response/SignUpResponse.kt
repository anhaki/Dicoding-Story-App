package com.haki.storyapp.response

import com.google.gson.annotations.SerializedName

data class SignUpResponse(
    @field:SerializedName("error")
    val error: Boolean,

    @field:SerializedName("message")
    val message: String
)

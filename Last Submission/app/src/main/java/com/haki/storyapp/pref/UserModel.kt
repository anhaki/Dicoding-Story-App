package com.haki.storyapp.pref

data class UserModel(
    val name: String,
    val token: String,
    val isLogin: Boolean = false
)
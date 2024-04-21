package com.test.qolami.model.data

import com.google.gson.annotations.SerializedName

data class DataLoginItem(
    @SerializedName("email")
    val email: String,
    @SerializedName("password")
    val password: String
)

package com.test.qolami.model.data.latihan


import com.google.gson.annotations.SerializedName

data class BankSoalVideoResponse(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: String
)
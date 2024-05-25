package com.test.qolami.model.data.latihan


import com.google.gson.annotations.SerializedName

data class BankSoalAudioResponse(
    @SerializedName("data")
    val `data`: DataXXXX,
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: String
)
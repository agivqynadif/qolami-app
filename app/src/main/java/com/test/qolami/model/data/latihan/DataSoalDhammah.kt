package com.test.qolami.model.data.latihan


import com.google.gson.annotations.SerializedName

data class DataSoalDhammah(
    @SerializedName("data")
    val `data`: DataXXX,
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: String
)
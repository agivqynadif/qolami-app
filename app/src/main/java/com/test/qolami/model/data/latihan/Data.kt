package com.test.qolami.model.data.latihan


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("latihanFathahVideo")
    val latihanFathahVideo: List<LatihanFathahVideo>
)
package com.test.qolami.model.data.latihan


import com.google.gson.annotations.SerializedName

data class DataX(
    @SerializedName("latihanKasrahVideo")
    val latihanKasrahVideo: List<LatihanKasrahVideo>
)
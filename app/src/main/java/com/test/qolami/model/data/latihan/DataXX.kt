package com.test.qolami.model.data.latihan


import com.google.gson.annotations.SerializedName

data class DataXX(
    @SerializedName("latihanHijaiyah")
    val latihanHijaiyah: List<LatihanHijaiyah>
)
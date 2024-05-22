package com.test.qolami.model.data.score


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("scoreDhammah")
    val scoreDhammah: ScoreRequest? = null,
    @SerializedName("scoreFathah")
    val scoreFathah: ScoreRequest? = null,
    @SerializedName("scoreKasrah")
    val scoreKasrah: ScoreRequest? = null,
    @SerializedName("scoreHijaiyah")
    val scoreHijaiyah: ScoreRequest? = null
)
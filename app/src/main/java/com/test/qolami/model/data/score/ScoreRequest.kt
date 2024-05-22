package com.test.qolami.model.data.score

import com.google.gson.annotations.SerializedName

data class ScoreRequest(
    @SerializedName("scoreAudio")
    val scoreAudio: Any? = null,
    @SerializedName("scoreImage")
    val scoreImage: Any?= null,
    @SerializedName("scoreVideo")
    val scoreVideo: Any? = null)

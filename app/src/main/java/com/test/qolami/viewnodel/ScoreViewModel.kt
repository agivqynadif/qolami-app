package com.test.qolami.viewnodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.test.qolami.model.data.score.*
import com.test.qolami.model.network.RestfulApi
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class ScoreViewModel@Inject constructor(private val Client: RestfulApi) : ViewModel() {
    private var liveDataScoreHijaiyah: MutableLiveData<Data> = MutableLiveData()
    fun patchScore(userId: String, score: Data) {
        Client.patchScore(userId, score).enqueue(object : Callback<ScoreResponse> {
            override fun onResponse(call: Call<ScoreResponse>, response: Response<ScoreResponse>) {
                if (response.isSuccessful) {
                    liveDataScoreHijaiyah.postValue(response.body()!!.data)

                } else {
                    liveDataScoreHijaiyah.postValue(null)
                    Log.e("Error", "onFailure: Error")
                }
            }
            override fun onFailure(call: Call<ScoreResponse>, t: Throwable) {
                Log.e("Error: ", "onFailure : ${t.message}")
            }

        })
    }
    private var liveDataGetScore : MutableLiveData<ScoreHijaiyah> = MutableLiveData()
    val dataGetScore : LiveData<ScoreHijaiyah>get() = liveDataGetScore
    fun getScoreHijaiyah(userId: String) {
        Client.getScore(userId).enqueue(object : Callback<GetScoreResponse> {
            override fun onResponse(call: Call<GetScoreResponse>, response: Response<GetScoreResponse>) {
                if (response.isSuccessful) {
                    liveDataGetScore.postValue(response.body()!!.data.score.scoreHijaiyah)

                } else {
                    liveDataGetScore.postValue(null)
                    Log.e("Error", "onFailure: Error")
                }
            }
            override fun onFailure(call: Call<GetScoreResponse>, t: Throwable) {
                Log.e("Error: ", "onFailure : ${t.message}")
            }

        })
    }
    private var liveDataGetScoreFathah : MutableLiveData<ScoreFathah> = MutableLiveData()
    val dataGetScoreFathah : LiveData<ScoreFathah>get() = liveDataGetScoreFathah
    fun getScoreFathah(userId: String) {
        Client.getScore(userId).enqueue(object : Callback<GetScoreResponse> {
            override fun onResponse(call: Call<GetScoreResponse>, response: Response<GetScoreResponse>) {
                if (response.isSuccessful) {
                    liveDataGetScoreFathah.postValue(response.body()!!.data.score.scoreFathah)

                } else {
                    liveDataGetScoreFathah.postValue(null)
                    Log.e("Error", "onFailure: Error")
                }
            }
            override fun onFailure(call: Call<GetScoreResponse>, t: Throwable) {
                Log.e("Error: ", "onFailure : ${t.message}")
            }

        })
    }
    private var liveDataGetScoreKasrah : MutableLiveData<ScoreKasrah> = MutableLiveData()
    val dataGetScoreKasrah : LiveData<ScoreKasrah>get() = liveDataGetScoreKasrah
    fun getScoreKasrah(userId: String) {
        Client.getScore(userId).enqueue(object : Callback<GetScoreResponse> {
            override fun onResponse(call: Call<GetScoreResponse>, response: Response<GetScoreResponse>) {
                if (response.isSuccessful) {
                    liveDataGetScoreKasrah.postValue(response.body()!!.data.score.scoreKasrah)

                } else {
                    liveDataGetScoreKasrah.postValue(null)
                    Log.e("Error", "onFailure: Error")
                }
            }
            override fun onFailure(call: Call<GetScoreResponse>, t: Throwable) {
                Log.e("Error: ", "onFailure : ${t.message}")
            }

        })
    }
    private var liveDataGetScoreDhammah : MutableLiveData<ScoreDhammah> = MutableLiveData()
    val dataGetScoreDhammah : LiveData<ScoreDhammah>get() = liveDataGetScoreDhammah
    fun getScoreDhammah(userId: String) {
        Client.getScore(userId).enqueue(object : Callback<GetScoreResponse> {
            override fun onResponse(call: Call<GetScoreResponse>, response: Response<GetScoreResponse>) {
                if (response.isSuccessful) {
                    liveDataGetScoreDhammah.postValue(response.body()!!.data.score.scoreDhammah)

                } else {
                    liveDataGetScoreDhammah.postValue(null)
                    Log.e("Error", "onFailure: Error")
                }
            }
            override fun onFailure(call: Call<GetScoreResponse>, t: Throwable) {
                Log.e("Error: ", "onFailure : ${t.message}")
            }

        })
    }

}
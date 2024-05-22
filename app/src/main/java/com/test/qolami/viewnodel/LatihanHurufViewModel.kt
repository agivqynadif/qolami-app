package com.test.qolami.viewnodel


import android.util.Log

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.test.qolami.R

import com.test.qolami.model.data.latihan.*
import com.test.qolami.model.network.RestfulApi
import com.test.qolami.view.latihan.data.DataLatihanHuruf
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class LatihanHurufViewModel @Inject constructor(private val Client: RestfulApi) : ViewModel() {
    val listData = arrayListOf(
        DataLatihanHuruf(R.drawable.img_hijaiyah, "Latihan 1","Huruf Hijaiyah"),
        DataLatihanHuruf(R.drawable.img_fathah, "Latihan 2","Huruf Berharakat Fathah"),
        DataLatihanHuruf(R.drawable.img_kasroh, "Latihan 3","Huruf Berharakat Kasrah"),
        DataLatihanHuruf(R.drawable.img_dhammah, "Latihan 4","Huruf Berharakat Dhammah"),
        /*DataPelajaranHuruf(R.drawable.img_fathahtain, "Pelajaran 5","Huruf Berharakat Fathahtain"),
        DataPelajaranHuruf(R.drawable.img_kasrahtain, "Pelajaran 6","Huruf Berharakat Kasrahtain"),
        DataPelajaranHuruf(R.drawable.dhammahtain, "Pelajaran 7","Huruf Berharakat Dhammahtain"),
        DataPelajaranHuruf(R.drawable.img_sukun, "Pelajaran 8","Huruf Berharakat Sukun"),
        DataPelajaranHuruf(R.drawable.img_tasyjid, "Pelajaran 9","Huruf Berharakat Tasydid")*/
    )
    val getDataHuruf : MutableLiveData<List<DataLatihanHuruf>> = MutableLiveData()
    fun getData(){
        getDataHuruf.value = listData
    }

    private var liveDataSoalImage: MutableLiveData<DataXX> = MutableLiveData()
    val dataSoalImage: LiveData<DataXX> get() = liveDataSoalImage
    fun getSoal() {
        Client.getSoalImage().enqueue(object : Callback<BankSoalImageResponse> {
            override fun onResponse(call: Call<BankSoalImageResponse>, response: Response<BankSoalImageResponse>) {
                if (response.isSuccessful) {
                    liveDataSoalImage.postValue(response.body()!!.data)

                } else {
                    liveDataSoalImage.postValue(null)
                    Log.e("Error", "onFailure: Error")
                }
            }

            override fun onFailure(call: Call<BankSoalImageResponse>, t: Throwable) {
                Log.e("Error: ", "onFailure : ${t.message}")
            }

        })
    }
    private var liveDataSoalImageFathah: MutableLiveData<DataXX> = MutableLiveData()
    val dataSoalImageFathah: LiveData<DataXX> get() = liveDataSoalImageFathah
    fun getSoalFathah() {
        Client.getSoalImageFathah().enqueue(object : Callback<BankSoalImageResponse> {
            override fun onResponse(call: Call<BankSoalImageResponse>, response: Response<BankSoalImageResponse>) {
                if (response.isSuccessful) {
                    liveDataSoalImageFathah.postValue(response.body()!!.data)

                } else {
                    liveDataSoalImageFathah.postValue(null)
                    Log.e("Error", "onFailure: Error")
                }
            }

            override fun onFailure(call: Call<BankSoalImageResponse>, t: Throwable) {
                Log.e("Error: ", "onFailure : ${t.message}")
            }

        })
    }
    private var liveDataSoalImageKasrah: MutableLiveData<DataXX> = MutableLiveData()
    val dataSoalImageKasrah: LiveData<DataXX> get() = liveDataSoalImageKasrah
    fun getSoalKasrah() {
        Client.getSoalImageKasrah().enqueue(object : Callback<BankSoalImageResponse> {
            override fun onResponse(call: Call<BankSoalImageResponse>, response: Response<BankSoalImageResponse>) {
                if (response.isSuccessful) {
                    liveDataSoalImageKasrah.postValue(response.body()!!.data)


                } else {
                    liveDataSoalImageKasrah.postValue(null)
                    Log.e("Error", "onFailure: Error")
                }
            }

            override fun onFailure(call: Call<BankSoalImageResponse>, t: Throwable) {
                Log.e("Error: ", "onFailure : ${t.message}")
            }

        })
    }
    private var liveDataSoalImageDhammah: MutableLiveData<DataXX> = MutableLiveData()
    val dataSoalImageDhammah: LiveData<DataXX> get() = liveDataSoalImageDhammah
    fun getSoalDhammah() {
        Client.getSoalImageDhammah().enqueue(object : Callback<BankSoalImageResponse> {
            override fun onResponse(call: Call<BankSoalImageResponse>, response: Response<BankSoalImageResponse>) {
                if (response.isSuccessful) {
                    liveDataSoalImageDhammah.postValue(response.body()!!.data)

                } else {
                    liveDataSoalImageDhammah.postValue(null)
                    Log.e("Error", "onFailure: Error")
                }
            }

            override fun onFailure(call: Call<BankSoalImageResponse>, t: Throwable) {
                Log.e("Error: ", "onFailure : ${t.message}")
            }

        })
    }
    private var liveDataSoalVideosFathah: MutableLiveData<Data> = MutableLiveData()
    val dataSoalVideosFathah: LiveData<Data> get() = liveDataSoalVideosFathah
    fun getSoalVideoFathah() {
        Client.getSoalVideosFathah().enqueue(object : Callback<BankSoalVideoResponse> {
            override fun onResponse(call: Call<BankSoalVideoResponse>, response: Response<BankSoalVideoResponse>) {
                if (response.isSuccessful) {
                    liveDataSoalVideosFathah.postValue(response.body()!!.data)

                } else {
                    liveDataSoalVideosFathah.postValue(null)
                    Log.e("Error", "onFailure: Error")
                }
            }

            override fun onFailure(call: Call<BankSoalVideoResponse>, t: Throwable) {
                Log.e("Error: ", "onFailure : ${t.message}")
            }

        })
    }
    private var liveDataSoalVideosKasrah: MutableLiveData<DataX> = MutableLiveData()
    val dataSoalVideosKasrah: LiveData<DataX> get() = liveDataSoalVideosKasrah
    fun getSoalVideoKasrah() {
        Client.getSoalVideosKasrah().enqueue(object : Callback<DataSoalKasrah> {
            override fun onResponse(call: Call<DataSoalKasrah>, response: Response<DataSoalKasrah>) {
                if (response.isSuccessful) {
                    liveDataSoalVideosKasrah.postValue(response.body()!!.data)

                } else {
                    liveDataSoalVideosKasrah.postValue(null)
                    Log.e("Error", "onFailure: Error")
                }
            }

            override fun onFailure(call: Call<DataSoalKasrah>, t: Throwable) {
                Log.e("Error: ", "onFailure : ${t.message}")
            }

        })
    }
    private var liveDataSoalVideosDhammah: MutableLiveData<DataXXX> = MutableLiveData()
    val dataSoalVideosDhammah: LiveData<DataXXX> get() = liveDataSoalVideosDhammah
    fun getSoalVideoDhammah() {
        Client.getSoalVideosDhammah().enqueue(object : Callback<DataSoalDhammah> {
            override fun onResponse(call: Call<DataSoalDhammah>, response: Response<DataSoalDhammah>) {
                if (response.isSuccessful) {
                    liveDataSoalVideosDhammah.postValue(response.body()!!.data)

                } else {
                    liveDataSoalVideosDhammah.postValue(null)
                    Log.e("Error", "onFailure: Error")
                }
            }

            override fun onFailure(call: Call<DataSoalDhammah>, t: Throwable) {
                Log.e("Error: ", "onFailure : ${t.message}")
            }

        })
    }
}

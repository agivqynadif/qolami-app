package com.test.qolami.viewnodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.test.qolami.R
import com.test.qolami.model.data.latihan.BankSoalImageResponse
import com.test.qolami.model.data.latihan.DataXX
import com.test.qolami.model.data.latihan.LatihanHijaiyah
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
}
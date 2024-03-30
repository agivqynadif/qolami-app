package com.test.qolami.viewnodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.test.qolami.R
import com.test.qolami.view.pelajaran.DataPelajaranHuruf
import com.test.qolami.view.pelajaran.DataPelajaranHurufDetail

class PelajaranHurufViewModel:ViewModel() {
    val listData = arrayListOf(
        DataPelajaranHuruf(R.drawable.img_hijaiyah, "Pelajaran 1","Huruf Hijaiyah"),
        DataPelajaranHuruf(R.drawable.img_fathah, "Pelajaran 2","Huruf Berharakat Fathah"),
        DataPelajaranHuruf(R.drawable.img_kasroh, "Pelajaran 3","Huruf Berharakat Kasrah"),
        DataPelajaranHuruf(R.drawable.img_dhammah, "Pelajaran 4","Huruf Berharakat Dhammah"),
        DataPelajaranHuruf(R.drawable.img_fathahtain, "Pelajaran 5","Huruf Berharakat Fathahtain"),
        DataPelajaranHuruf(R.drawable.img_kasrahtain, "Pelajaran 6","Huruf Berharakat Kasrahtain"),
        DataPelajaranHuruf(R.drawable.dhammahtain, "Pelajaran 7","Huruf Berharakat Dhammahtain"),
        DataPelajaranHuruf(R.drawable.img_sukun, "Pelajaran 8","Huruf Berharakat Sukun"),
        DataPelajaranHuruf(R.drawable.img_tasyjid, "Pelajaran 9","Huruf Berharakat Tasydid"))
    val getDataHuruf : MutableLiveData<List<DataPelajaranHuruf>> = MutableLiveData()
    fun getData(){
        getDataHuruf.value = listData
    }
    val listDataPelajaranDetail = arrayListOf(
        DataPelajaranHurufDetail("Pelajaran 1", R.drawable.img_hijaiyah, "Pelajaran 1", "Huruf Hijaiyah", "Mulai dari Huruf Hijaiyah dan  pengenalan sistem penulisan dalam bahasa Arab"),
        DataPelajaranHurufDetail("Pelajaran 2", R.drawable.img_fathah, "Pelajaran 2", "Huruf Berharakat Fathah", "Pelajari penggunaan harakat Fathah pada kata, frasa, dan konsep tata bahasa"),
        DataPelajaranHurufDetail("Pelajaran 3", R.drawable.img_kasroh, "Pelajaran 3", "Huruf Berharakat Kasrah", "Pelajari penggunaan harakat Kasrah pada kata, frasa, dan konsep tata bahasa"),
        DataPelajaranHurufDetail("Pelajaran 4", R.drawable.img_dhammah, "Pelajaran 4", "Huruf Berharakat Dhammah", "Pelajari penggunaan harakat Dhammah pada kata, frasa, dan konsep tata bahasa"),
        DataPelajaranHurufDetail("Pelajaran 5", R.drawable.img_fathahtain, "Pelajaran 5", "Huruf Berharakat Fathatain", "Pelajari penggunaan harakat Fathahtain pada kata, frasa, dan konsep tata bahasa"),
        DataPelajaranHurufDetail("Pelajaran 6", R.drawable.img_kasrahtain, "Pelajaran 6", "Huruf Berharakat Kasratain", "Pelajari penggunaan harakat Kasrahtain pada kata, frasa, dan konsep tata bahasa"),
        DataPelajaranHurufDetail("Pelajaran 7", R.drawable.dhammahtain, "Pelajaran 7", "Huruf Berharakat Dhammatain", "Pelajari penggunaan harakat Dhammahtain pada kata, frasa, dan konsep tata bahasa"),
        DataPelajaranHurufDetail("Pelajaran 8", R.drawable.img_sukun, "Pelajaran 8", "Huruf Berharakat Sukun", "Pelajari penggunaan harakat Sukun pada kata, frasa, dan konsep tata bahasa"),
        DataPelajaranHurufDetail("Pelajaran 9", R.drawable.img_tasyjid, "Pelajaran 9", "Huruf Berharakat Tasydid/ Syiddah", "Pelajari penggunaan harakat Taydid / Syiddah pada kata, frasa, dan konsep tata bahasa")
    )
    val getDataHurufDetail : MutableLiveData<List<DataPelajaranHurufDetail>> = MutableLiveData()
    fun getDataDetail(){
        getDataHurufDetail.value = listDataPelajaranDetail
    }

}
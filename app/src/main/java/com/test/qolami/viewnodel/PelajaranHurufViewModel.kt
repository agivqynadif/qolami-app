package com.test.qolami.viewnodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.test.qolami.R
import com.test.qolami.view.pelajaran.data.DataMenuPelajaran1Huruf
import com.test.qolami.view.pelajaran.data.DataPelajaranHuruf
import com.test.qolami.view.pelajaran.data.DataPelajaranHurufDetail

class PelajaranHurufViewModel:ViewModel() {
    val listData = arrayListOf(
        DataPelajaranHuruf(R.drawable.img_hijaiyah, "Pelajaran 1","Huruf Hijaiyah"),
        DataPelajaranHuruf(R.drawable.img_fathah, "Pelajaran 2","Huruf Berharakat Fathah"),
        DataPelajaranHuruf(R.drawable.img_kasroh, "Pelajaran 3","Huruf Berharakat Kasrah"),
        DataPelajaranHuruf(R.drawable.img_dhammah, "Pelajaran 4","Huruf Berharakat Dhammah"),
        /*DataPelajaranHuruf(R.drawable.img_fathahtain, "Pelajaran 5","Huruf Berharakat Fathahtain"),
        DataPelajaranHuruf(R.drawable.img_kasrahtain, "Pelajaran 6","Huruf Berharakat Kasrahtain"),
        DataPelajaranHuruf(R.drawable.dhammahtain, "Pelajaran 7","Huruf Berharakat Dhammahtain"),
        DataPelajaranHuruf(R.drawable.img_sukun, "Pelajaran 8","Huruf Berharakat Sukun"),
        DataPelajaranHuruf(R.drawable.img_tasyjid, "Pelajaran 9","Huruf Berharakat Tasydid")*/
    )
    val getDataHuruf : MutableLiveData<List<DataPelajaranHuruf>> = MutableLiveData()
    fun getData(){
        getDataHuruf.value = listData
    }
    val listDataPelajaranDetail = arrayListOf(
        DataPelajaranHurufDetail("Pelajaran 1", R.drawable.img_hijaiyah, "Pelajaran 1", "Huruf Hijaiyah", "Mulai dari Huruf Hijaiyah dan  pengenalan sistem penulisan dalam bahasa Arab"),
        DataPelajaranHurufDetail("Pelajaran 2", R.drawable.img_fathah, "Pelajaran 2", "Huruf Berharakat Fathah", "Pelajari penggunaan harakat Fathah pada kata, frasa, dan konsep tata bahasa"),
        DataPelajaranHurufDetail("Pelajaran 3", R.drawable.img_kasroh, "Pelajaran 3", "Huruf Berharakat Kasrah", "Pelajari penggunaan harakat Kasrah pada kata, frasa, dan konsep tata bahasa"),
        DataPelajaranHurufDetail("Pelajaran 4", R.drawable.img_dhammah, "Pelajaran 4", "Huruf Berharakat Dhammah", "Pelajari penggunaan harakat Dhammah pada kata, frasa, dan konsep tata bahasa"),
        /*DataPelajaranHurufDetail("Pelajaran 5", R.drawable.img_fathahtain, "Pelajaran 5", "Huruf Berharakat Fathatain", "Pelajari penggunaan harakat Fathahtain pada kata, frasa, dan konsep tata bahasa"),
        DataPelajaranHurufDetail("Pelajaran 6", R.drawable.img_kasrahtain, "Pelajaran 6", "Huruf Berharakat Kasratain", "Pelajari penggunaan harakat Kasrahtain pada kata, frasa, dan konsep tata bahasa"),
        DataPelajaranHurufDetail("Pelajaran 7", R.drawable.dhammahtain, "Pelajaran 7", "Huruf Berharakat Dhammatain", "Pelajari penggunaan harakat Dhammahtain pada kata, frasa, dan konsep tata bahasa"),
        DataPelajaranHurufDetail("Pelajaran 8", R.drawable.img_sukun, "Pelajaran 8", "Huruf Berharakat Sukun", "Pelajari penggunaan harakat Sukun pada kata, frasa, dan konsep tata bahasa"),
        DataPelajaranHurufDetail("Pelajaran 9", R.drawable.img_tasyjid, "Pelajaran 9", "Huruf Berharakat Tasydid/ Syiddah", "Pelajari penggunaan harakat Taydid / Syiddah pada kata, frasa, dan konsep tata bahasa")*/
    )
    val getDataHurufDetail : MutableLiveData<List<DataPelajaranHurufDetail>> = MutableLiveData()
    fun getDataDetail(){
        getDataHurufDetail.value = listDataPelajaranDetail
    }
    val listDataMenuPelajaran1 = arrayListOf(
        DataMenuPelajaran1Huruf(1, R.drawable.h_jim),
        DataMenuPelajaran1Huruf(2, R.drawable.h_sa),
        DataMenuPelajaran1Huruf(3, R.drawable.h_ta),
        DataMenuPelajaran1Huruf(4, R.drawable.h_ba),
        DataMenuPelajaran1Huruf(5, R.drawable.h_alif),
        DataMenuPelajaran1Huruf(6, R.drawable.h_ra),
        DataMenuPelajaran1Huruf(7, R.drawable.h_dzal),
        DataMenuPelajaran1Huruf(8, R.drawable.h_dal),
        DataMenuPelajaran1Huruf(9, R.drawable.h_kho),
        DataMenuPelajaran1Huruf(10, R.drawable.h_kha),
        DataMenuPelajaran1Huruf(11, R.drawable.h_dzo),
        DataMenuPelajaran1Huruf(12, R.drawable.h_shod),
        DataMenuPelajaran1Huruf(13, R.drawable.h_syin),
        DataMenuPelajaran1Huruf(14, R.drawable.h_sin),
        DataMenuPelajaran1Huruf(15, R.drawable.h_za),
        DataMenuPelajaran1Huruf(16, R.drawable.h_fa),
        DataMenuPelajaran1Huruf(17, R.drawable.h_goin),
        DataMenuPelajaran1Huruf(18, R.drawable.h_ain),
        DataMenuPelajaran1Huruf(19, R.drawable.h_tzo),
        DataMenuPelajaran1Huruf(20, R.drawable.h_tho),
        DataMenuPelajaran1Huruf(21, R.drawable.h_nun),
        DataMenuPelajaran1Huruf(22, R.drawable.h_mim),
        DataMenuPelajaran1Huruf(23, R.drawable.h_lam),
        DataMenuPelajaran1Huruf(24, R.drawable.h_kaf),
        DataMenuPelajaran1Huruf(25, R.drawable.h_kof),
        DataMenuPelajaran1Huruf(26, R.drawable.h_ya),
        DataMenuPelajaran1Huruf(27, R.drawable.h_hamzah),
        DataMenuPelajaran1Huruf(28, R.drawable.h_lamalif),
        DataMenuPelajaran1Huruf(29, R.drawable.h_ha),
        DataMenuPelajaran1Huruf(30, R.drawable.h_waw)
    )
    val getDataPelajaran1:MutableLiveData<List<DataMenuPelajaran1Huruf>> = MutableLiveData()
    fun getPelajaran1(){
        getDataPelajaran1.value = listDataMenuPelajaran1
    }
    val listDataMenuPelajaran2 = arrayListOf(
        DataMenuPelajaran1Huruf(1, R.drawable.hfp_ja_fathah_putih),
        DataMenuPelajaran1Huruf(2, R.drawable.hfp_tsa_fathah_putih),
        DataMenuPelajaran1Huruf(3, R.drawable.hfp_ta_fathah_putih),
        DataMenuPelajaran1Huruf(4, R.drawable.hfp_ba_fathah_putih),
        DataMenuPelajaran1Huruf(5, R.drawable.hfp_alif_fathah_putih),
        DataMenuPelajaran1Huruf(6, R.drawable.hfp_ra_fathah_putih),
        DataMenuPelajaran1Huruf(7, R.drawable.hfp_dza_fathah_putih),
        DataMenuPelajaran1Huruf(8, R.drawable.hfp_dal_fathah_putih),
        DataMenuPelajaran1Huruf(9, R.drawable.hfp_kho_fathah_putih),
        DataMenuPelajaran1Huruf(10, R.drawable.hfp_ha_fathah_putih),
        DataMenuPelajaran1Huruf(11, R.drawable.hfp_dzo_fathah_putih),
        DataMenuPelajaran1Huruf(12, R.drawable.hfp_shod_fathah_putih),
        DataMenuPelajaran1Huruf(13, R.drawable.hfp_syin_fathah_putih),
        DataMenuPelajaran1Huruf(14, R.drawable.hfp_sin_fathah_putih),
        DataMenuPelajaran1Huruf(15, R.drawable.hfp_dzai_fathah_putih),
        DataMenuPelajaran1Huruf(16, R.drawable.hfp_fa_fathah_putih),
        DataMenuPelajaran1Huruf(17, R.drawable.hfp_ghain_fathah_putih),
        DataMenuPelajaran1Huruf(18, R.drawable.hfp_ain_fathah_putih),
        DataMenuPelajaran1Huruf(19, R.drawable.hfp_tzo_fathah_putih),
        DataMenuPelajaran1Huruf(20, R.drawable.hfp_tho_fathah_putih),
        DataMenuPelajaran1Huruf(21, R.drawable.hfp_nun_fathah_putih),
        DataMenuPelajaran1Huruf(22, R.drawable.hfp_mim_fathah_putih),
        DataMenuPelajaran1Huruf(23, R.drawable.hfp_lam_fathah_putih),
        DataMenuPelajaran1Huruf(24, R.drawable.hfp_kaf_fathah_putih),
        DataMenuPelajaran1Huruf(25, R.drawable.hfp_ko_fathah_putih),
        DataMenuPelajaran1Huruf(26, R.drawable.hfp_ya_fathah_putih),
        DataMenuPelajaran1Huruf(27, R.drawable.hfp_hah_fathah_putih),
        DataMenuPelajaran1Huruf(28, R.drawable.hfp_waw_fathah_putih),
    )
    val getDataPelajaran2 : MutableLiveData<List<DataMenuPelajaran1Huruf>> = MutableLiveData()
    fun getPelajaran2(){
        getDataPelajaran2.value = listDataMenuPelajaran2
    }
    val listDataMenuPelajaran3 = arrayListOf(
        DataMenuPelajaran1Huruf(1, R.drawable.hkp_ji_kasrah_putih),
        DataMenuPelajaran1Huruf(2, R.drawable.hkp_tsa_kasrah_putih),
        DataMenuPelajaran1Huruf(3, R.drawable.hkp_ta_kasrah_putih),
        DataMenuPelajaran1Huruf(4, R.drawable.hkp_ba_kasrah_putih),
        DataMenuPelajaran1Huruf(5, R.drawable.hkp_alif_kasrah_putih),
        DataMenuPelajaran1Huruf(6, R.drawable.hkp_ra_kasrah_putih),
        DataMenuPelajaran1Huruf(7, R.drawable.hkp_dza_kasrah_putih),
        DataMenuPelajaran1Huruf(8, R.drawable.hkp_dal_kasrah_putih),
        DataMenuPelajaran1Huruf(9, R.drawable.hkp_kho_kasrah_putih),
        DataMenuPelajaran1Huruf(10, R.drawable.hkp_kha_kasrah_putih),
        DataMenuPelajaran1Huruf(11, R.drawable.hkp_dho_kasrah_putih),
        DataMenuPelajaran1Huruf(12, R.drawable.hkp_shod_kasrah_putih),
        DataMenuPelajaran1Huruf(13, R.drawable.hkp_syin_kasrah_putih),
        DataMenuPelajaran1Huruf(14, R.drawable.hkp_sin_kasrah_putih),
        DataMenuPelajaran1Huruf(15, R.drawable.hkp_zai_kasrah_putih),
        DataMenuPelajaran1Huruf(16, R.drawable.hkp_fa_kasrah_putih),
        DataMenuPelajaran1Huruf(17, R.drawable.hkp_goin_kasrah_putih),
        DataMenuPelajaran1Huruf(18, R.drawable.hkp_ain_kasrah_putih),
        DataMenuPelajaran1Huruf(19, R.drawable.hkp_dzo_kasrah_putih),
        DataMenuPelajaran1Huruf(20, R.drawable.hkp_tho_kasrah_putih),
        DataMenuPelajaran1Huruf(21, R.drawable.hkp_nun_kasrah_putih),
        DataMenuPelajaran1Huruf(22, R.drawable.hkp_mim_kasrah_putih),
        DataMenuPelajaran1Huruf(23, R.drawable.hkp_lam_kasrah_putih),
        DataMenuPelajaran1Huruf(24, R.drawable.hkp_kaf_kasrah_putih),
        DataMenuPelajaran1Huruf(25, R.drawable.hkp_kof_kasrah_putih),
        DataMenuPelajaran1Huruf(26, R.drawable.hkp_ya_kasrah_putih),
        DataMenuPelajaran1Huruf(27, R.drawable.hkp_ha_kasrah_putih),
        DataMenuPelajaran1Huruf(28, R.drawable.hkp_waw_kasrah_putih),
    )
    val getDataPelajaran3 : MutableLiveData<List<DataMenuPelajaran1Huruf>> = MutableLiveData()
    fun getPelajaran3 (){
        getDataPelajaran3.value = listDataMenuPelajaran3
    }
    val listDataMenuPelajaran4 = arrayListOf(
        DataMenuPelajaran1Huruf(1, R.drawable.hdp_ja_dhammah_putih),
        DataMenuPelajaran1Huruf(2, R.drawable.hdp_tsa_dhammah_putih),
        DataMenuPelajaran1Huruf(3, R.drawable.hdp_ta_dhammah_putih),
        DataMenuPelajaran1Huruf(4, R.drawable.hdp_ba__dhammah_putih),
        DataMenuPelajaran1Huruf(5, R.drawable.hdp_alif_dhammah_putih),
        DataMenuPelajaran1Huruf(6, R.drawable.hdp_ra_dhammah_putih),
        DataMenuPelajaran1Huruf(7, R.drawable.hdp_dza_dhammah_putih),
        DataMenuPelajaran1Huruf(8, R.drawable.hdp_dal_dhammah_putih),
        DataMenuPelajaran1Huruf(9, R.drawable.hdp_kho_dhammah_putih),
        DataMenuPelajaran1Huruf(10, R.drawable.hdp_kha_dhammah_putih),
        DataMenuPelajaran1Huruf(11, R.drawable.hdp_dho_dhammah_putih),
        DataMenuPelajaran1Huruf(12, R.drawable.hdp_shod_dhammah_putih),
        DataMenuPelajaran1Huruf(13, R.drawable.hdp_syin_dhammah_putih),
        DataMenuPelajaran1Huruf(14, R.drawable.hdp_sin_dhammah_putih),
        DataMenuPelajaran1Huruf(15, R.drawable.hdp_zai_dhammah_putih),
        DataMenuPelajaran1Huruf(16, R.drawable.hdp_fa_dhammah_putih),
        DataMenuPelajaran1Huruf(17, R.drawable.hdp_goin_dhammah_putih),
        DataMenuPelajaran1Huruf(18, R.drawable.hdp_ain_dhammah_putih),
        DataMenuPelajaran1Huruf(19, R.drawable.hdp_tzo_dhammah_putih),
        DataMenuPelajaran1Huruf(20, R.drawable.hdp_tho_dhammah_putih),
        DataMenuPelajaran1Huruf(21, R.drawable.hdp_nun_dhammah_putih),
        DataMenuPelajaran1Huruf(22, R.drawable.hdp_mim_dhammah_putih),
        DataMenuPelajaran1Huruf(23, R.drawable.hdp_lam_dhammah_putih),
        DataMenuPelajaran1Huruf(24, R.drawable.hdp_kaf_dhammah_putih),
        DataMenuPelajaran1Huruf(25, R.drawable.hdp_kof_dhammah_putih),
        DataMenuPelajaran1Huruf(26, R.drawable.hdp_ya_dhammah_putih),
        DataMenuPelajaran1Huruf(27, R.drawable.hdp_ha_dhammah_putih),
        DataMenuPelajaran1Huruf(28, R.drawable.hdp_waw_dhammah_putih),
    )
    val getDataPelajaran4 : MutableLiveData<List<DataMenuPelajaran1Huruf>> = MutableLiveData()
    fun getPelajaran4 (){
        getDataPelajaran4.value = listDataMenuPelajaran4
    }

}
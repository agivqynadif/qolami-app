package com.test.qolami.viewnodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.test.qolami.R
import com.test.qolami.view.pelajaran.data.DataMenuPelajaran1Huruf
import com.test.qolami.view.pelajaran.data.DataPelajaranHuruf
import com.test.qolami.view.pelajaran.data.DataPelajaranHurufDetail
import com.test.qolami.view.pelajaran.data.DataVidPelajaranHuruf

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
        DataMenuPelajaran1Huruf(1, R.drawable.h_alif),
        DataMenuPelajaran1Huruf(2, R.drawable.h_ba),
        DataMenuPelajaran1Huruf(3, R.drawable.h_ta),
        DataMenuPelajaran1Huruf(4, R.drawable.h_sa),
        DataMenuPelajaran1Huruf(5, R.drawable.h_jim),
        DataMenuPelajaran1Huruf(6, R.drawable.h_kha),
        DataMenuPelajaran1Huruf(7, R.drawable.h_kho),
        DataMenuPelajaran1Huruf(8, R.drawable.h_dal),
        DataMenuPelajaran1Huruf(9, R.drawable.h_dzal),
        DataMenuPelajaran1Huruf(10, R.drawable.h_ra),
        DataMenuPelajaran1Huruf(11, R.drawable.h_za),
        DataMenuPelajaran1Huruf(12, R.drawable.h_sin),
        DataMenuPelajaran1Huruf(13, R.drawable.h_syin),
        DataMenuPelajaran1Huruf(14, R.drawable.h_shod),
        DataMenuPelajaran1Huruf(15, R.drawable.h_dzo),
        DataMenuPelajaran1Huruf(16, R.drawable.h_tho),
        DataMenuPelajaran1Huruf(17, R.drawable.h_tzo),
        DataMenuPelajaran1Huruf(18, R.drawable.h_ain),
        DataMenuPelajaran1Huruf(19, R.drawable.h_goin),
        DataMenuPelajaran1Huruf(20, R.drawable.h_fa),
        DataMenuPelajaran1Huruf(21, R.drawable.h_kof),
        DataMenuPelajaran1Huruf(22, R.drawable.h_kaf),
        DataMenuPelajaran1Huruf(23, R.drawable.h_lam),
        DataMenuPelajaran1Huruf(24, R.drawable.h_mim),
        DataMenuPelajaran1Huruf(25, R.drawable.h_nun),
        DataMenuPelajaran1Huruf(26, R.drawable.h_waw),
        DataMenuPelajaran1Huruf(27, R.drawable.h_ha),
        DataMenuPelajaran1Huruf(28, R.drawable.h_lamalif),
        DataMenuPelajaran1Huruf(29, R.drawable.h_hamzah),
        DataMenuPelajaran1Huruf(30, R.drawable.h_ya)
    )
    val getDataPelajaran1:MutableLiveData<List<DataMenuPelajaran1Huruf>> = MutableLiveData()
    fun getPelajaran1(){
        getDataPelajaran1.value = listDataMenuPelajaran1
    }
    val listDataMenuPelajaran2 = arrayListOf(
        DataMenuPelajaran1Huruf(1, R.drawable.hfp_alif_fathah_putih),
        DataMenuPelajaran1Huruf(2, R.drawable.hfp_ba_fathah_putih),
        DataMenuPelajaran1Huruf(3, R.drawable.hfp_ta_fathah_putih),
        DataMenuPelajaran1Huruf(4, R.drawable.hfp_tsa_fathah_putih),
        DataMenuPelajaran1Huruf(5, R.drawable.hfp_ja_fathah_putih),
        DataMenuPelajaran1Huruf(6, R.drawable.hfp_ha_fathah_putih),
        DataMenuPelajaran1Huruf(7, R.drawable.hfp_kho_fathah_putih),
        DataMenuPelajaran1Huruf(8, R.drawable.hfp_dal_fathah_putih),
        DataMenuPelajaran1Huruf(9, R.drawable.hfp_dza_fathah_putih),
        DataMenuPelajaran1Huruf(10, R.drawable.hfp_ra_fathah_putih),
        DataMenuPelajaran1Huruf(11, R.drawable.hfp_dzai_fathah_putih),
        DataMenuPelajaran1Huruf(12, R.drawable.hfp_sin_fathah_putih),
        DataMenuPelajaran1Huruf(13, R.drawable.hfp_syin_fathah_putih),
        DataMenuPelajaran1Huruf(14, R.drawable.hfp_shod_fathah_putih),
        DataMenuPelajaran1Huruf(15, R.drawable.hfp_dzo_fathah_putih),
        DataMenuPelajaran1Huruf(16, R.drawable.hfp_tho_fathah_putih),
        DataMenuPelajaran1Huruf(17, R.drawable.hfp_tzo_fathah_putih),
        DataMenuPelajaran1Huruf(18, R.drawable.hfp_ain_fathah_putih),
        DataMenuPelajaran1Huruf(19, R.drawable.hfp_ghain_fathah_putih),
        DataMenuPelajaran1Huruf(20, R.drawable.hfp_fa_fathah_putih),
        DataMenuPelajaran1Huruf(21, R.drawable.hfp_ko_fathah_putih),
        DataMenuPelajaran1Huruf(22, R.drawable.hfp_kaf_fathah_putih),
        DataMenuPelajaran1Huruf(23, R.drawable.hfp_lam_fathah_putih),
        DataMenuPelajaran1Huruf(24, R.drawable.hfp_mim_fathah_putih),
        DataMenuPelajaran1Huruf(25, R.drawable.hfp_nun_fathah_putih),
        DataMenuPelajaran1Huruf(26, R.drawable.hfp_waw_fathah_putih),
        DataMenuPelajaran1Huruf(27, R.drawable.hfp_hah_fathah_putih),
        DataMenuPelajaran1Huruf(28, R.drawable.hfp_ya_fathah_putih)
    )
    val getDataPelajaran2 : MutableLiveData<List<DataMenuPelajaran1Huruf>> = MutableLiveData()
    fun getPelajaran2(){
        getDataPelajaran2.value = listDataMenuPelajaran2
    }
    val listDataMenuPelajaran3 = arrayListOf(
        DataMenuPelajaran1Huruf(1, R.drawable.hkp_alif_kasrah_putih),
        DataMenuPelajaran1Huruf(2, R.drawable.hkp_ba_kasrah_putih),
        DataMenuPelajaran1Huruf(3, R.drawable.hkp_ta_kasrah_putih),
        DataMenuPelajaran1Huruf(4, R.drawable.hkp_tsa_kasrah_putih),
        DataMenuPelajaran1Huruf(5, R.drawable.hkp_ji_kasrah_putih),
        DataMenuPelajaran1Huruf(6, R.drawable.hkp_kha_kasrah_putih),
        DataMenuPelajaran1Huruf(7, R.drawable.hkp_kho_kasrah_putih),
        DataMenuPelajaran1Huruf(8, R.drawable.hkp_dal_kasrah_putih),
        DataMenuPelajaran1Huruf(9, R.drawable.hkp_dza_kasrah_putih),
        DataMenuPelajaran1Huruf(10, R.drawable.hkp_ra_kasrah_putih),
        DataMenuPelajaran1Huruf(11, R.drawable.hkp_zai_kasrah_putih),
        DataMenuPelajaran1Huruf(12, R.drawable.hkp_sin_kasrah_putih),
        DataMenuPelajaran1Huruf(13, R.drawable.hkp_syin_kasrah_putih),
        DataMenuPelajaran1Huruf(14, R.drawable.hkp_shod_kasrah_putih),
        DataMenuPelajaran1Huruf(15, R.drawable.hkp_dho_kasrah_putih),
        DataMenuPelajaran1Huruf(16, R.drawable.hkp_tho_kasrah_putih),
        DataMenuPelajaran1Huruf(17, R.drawable.hkp_dzo_kasrah_putih),
        DataMenuPelajaran1Huruf(18, R.drawable.hkp_ain_kasrah_putih),
        DataMenuPelajaran1Huruf(19, R.drawable.hkp_goin_kasrah_putih),
        DataMenuPelajaran1Huruf(20, R.drawable.hkp_fa_kasrah_putih),
        DataMenuPelajaran1Huruf(21, R.drawable.hkp_kof_kasrah_putih),
        DataMenuPelajaran1Huruf(22, R.drawable.hkp_kaf_kasrah_putih),
        DataMenuPelajaran1Huruf(23, R.drawable.hkp_lam_kasrah_putih),
        DataMenuPelajaran1Huruf(24, R.drawable.hkp_mim_kasrah_putih),
        DataMenuPelajaran1Huruf(25, R.drawable.hkp_nun_kasrah_putih),
        DataMenuPelajaran1Huruf(26, R.drawable.hkp_waw_kasrah_putih),
        DataMenuPelajaran1Huruf(27, R.drawable.hkp_ha_kasrah_putih),
        DataMenuPelajaran1Huruf(28, R.drawable.hkp_ya_kasrah_putih),
    )
    val getDataPelajaran3 : MutableLiveData<List<DataMenuPelajaran1Huruf>> = MutableLiveData()
    fun getPelajaran3 (){
        getDataPelajaran3.value = listDataMenuPelajaran3
    }
    val listDataMenuPelajaran4 = arrayListOf(
        DataMenuPelajaran1Huruf(1, R.drawable.hdp_alif_dhammah_putih),
        DataMenuPelajaran1Huruf(2, R.drawable.hdp_ba__dhammah_putih),
        DataMenuPelajaran1Huruf(3, R.drawable.hdp_ta_dhammah_putih),
        DataMenuPelajaran1Huruf(4, R.drawable.hdp_tsa_dhammah_putih),
        DataMenuPelajaran1Huruf(5, R.drawable.hdp_ja_dhammah_putih),
        DataMenuPelajaran1Huruf(6, R.drawable.hdp_kha_dhammah_putih),
        DataMenuPelajaran1Huruf(7, R.drawable.hdp_kho_dhammah_putih),
        DataMenuPelajaran1Huruf(8, R.drawable.hdp_dal_dhammah_putih),
        DataMenuPelajaran1Huruf(9, R.drawable.hdp_dza_dhammah_putih),
        DataMenuPelajaran1Huruf(10, R.drawable.hdp_ra_dhammah_putih),
        DataMenuPelajaran1Huruf(11, R.drawable.hdp_zai_dhammah_putih),
        DataMenuPelajaran1Huruf(12, R.drawable.hdp_sin_dhammah_putih),
        DataMenuPelajaran1Huruf(13, R.drawable.hdp_syin_dhammah_putih),
        DataMenuPelajaran1Huruf(14, R.drawable.hdp_shod_dhammah_putih),
        DataMenuPelajaran1Huruf(15, R.drawable.hdp_dho_dhammah_putih),
        DataMenuPelajaran1Huruf(16, R.drawable.hdp_tho_dhammah_putih),
        DataMenuPelajaran1Huruf(17, R.drawable.hdp_tzo_dhammah_putih),
        DataMenuPelajaran1Huruf(18, R.drawable.hdp_ain_dhammah_putih),
        DataMenuPelajaran1Huruf(19, R.drawable.hdp_goin_dhammah_putih),
        DataMenuPelajaran1Huruf(20, R.drawable.hdp_fa_dhammah_putih),
        DataMenuPelajaran1Huruf(21, R.drawable.hdp_kof_dhammah_putih),
        DataMenuPelajaran1Huruf(22, R.drawable.hdp_kaf_dhammah_putih),
        DataMenuPelajaran1Huruf(23, R.drawable.hdp_lam_dhammah_putih),
        DataMenuPelajaran1Huruf(24, R.drawable.hdp_mim_dhammah_putih),
        DataMenuPelajaran1Huruf(25, R.drawable.hdp_nun_dhammah_putih),
        DataMenuPelajaran1Huruf(26, R.drawable.hdp_waw_dhammah_putih),
        DataMenuPelajaran1Huruf(27, R.drawable.hdp_ha_dhammah_putih),
        DataMenuPelajaran1Huruf(28, R.drawable.hdp_ya_dhammah_putih),
    )
    val getDataPelajaran4 : MutableLiveData<List<DataMenuPelajaran1Huruf>> = MutableLiveData()
    fun getPelajaran4 (){
        getDataPelajaran4.value = listDataMenuPelajaran4
    }
    private val hurufList: List<DataVidPelajaranHuruf> = listOf(
        DataVidPelajaranHuruf(1,0,"Pelajaran 2","ntD81WB132A"),
        DataVidPelajaranHuruf(2,0,"Pelajaran 2","Ii477YjhDVk"),
        DataVidPelajaranHuruf(3,0,"Pelajaran 2","6UexQWMnx0I"),
        DataVidPelajaranHuruf(4,0,"Pelajaran 2","moa8jxvBM_g"),
        DataVidPelajaranHuruf(5,0,"Pelajaran 2","OF0pHtNcJts"),
        DataVidPelajaranHuruf(6,0, "Pelajaran 2" ,"uLXf6TiBhXo"),
        DataVidPelajaranHuruf(7,0,"Pelajaran 2","06mNtQn5hPM"),
        DataVidPelajaranHuruf(8,0,"Pelajaran 2","KLA7uwvxyvg"),
        DataVidPelajaranHuruf(9,0,"Pelajaran 2","bs-yAjuvs0k"),
        DataVidPelajaranHuruf(10,0,"Pelajaran 2","zTJpyte5QHU"),
        DataVidPelajaranHuruf(11,0,"Pelajaran 2","jcL6tk5FIt8"),
        DataVidPelajaranHuruf(12,0,"Pelajaran 2","T4rX3SeZH-c"),
        DataVidPelajaranHuruf(13,0,"Pelajaran 2","eEpYreBDeE8"),
        DataVidPelajaranHuruf(14,0,"Pelajaran 2","mLUaUAL-Ty8"),
        DataVidPelajaranHuruf(15,0,"Pelajaran 2","YWbUdRmyQsQ"),
        DataVidPelajaranHuruf(16,0,"Pelajaran 2","6FzZ3jQrvL8"),
        DataVidPelajaranHuruf(17,0,"Pelajaran 2","lg441UMEv_Q"),
        DataVidPelajaranHuruf(18,0,"Pelajaran 2","06WeCyI7E5c"),
        DataVidPelajaranHuruf(19,0,"Pelajaran 2","GNDEM9GktSw"),
        DataVidPelajaranHuruf(20,0,"Pelajaran 2","q9W37UTUPIU"),
        DataVidPelajaranHuruf(21,0,"Pelajaran 2","aBxg0IK6uBI"),
        DataVidPelajaranHuruf(22,0,"Pelajaran 2","7DKP8vW8AOo"),
        DataVidPelajaranHuruf(23,0,"Pelajaran 2","XQaApdhUYVE"),
        DataVidPelajaranHuruf(24,0,"Pelajaran 2","M6rl_6dC66Q"),
        DataVidPelajaranHuruf(25,0,"Pelajaran 2","PyjozCgnyI8"),
        DataVidPelajaranHuruf(26,0,"Pelajaran 2","VsnSAjDNTXs"),
        DataVidPelajaranHuruf(27,0,"Pelajaran 2","WHU0lJbWVuk"),
        DataVidPelajaranHuruf(28,0,"Pelajaran 2","3CzzT9ZO604")
    )

    private val hurufListKasrah: List<DataVidPelajaranHuruf> = listOf(
        DataVidPelajaranHuruf(1,0,"Alif Berharakat Kasrah","wJ8WaPcZM_M"),
        DataVidPelajaranHuruf(2,0,"Ba Berharakat Kasrah","IrLP1XYuIjs"),
        DataVidPelajaranHuruf(3,0,"Ta Berharakat Kasrah","4zN2OpUqJI8"),
        DataVidPelajaranHuruf(4,0,"Tsa Berharakat Kasrah","U5xikMGMdTg"),
        DataVidPelajaranHuruf(5,0,"Jim Berharakat Kasrah","uXO3saszpSk"),
        DataVidPelajaranHuruf(6,0,"Ha Berharakat Kasrah","Y_-BPpF6AW8"),
        DataVidPelajaranHuruf(7,0,"Kho Berharakat Kasrah","sBl7jEm0Xmk"),
        DataVidPelajaranHuruf(8,0,"Dal Berharakat Kasrah","fapuqkYj4kA"),
        DataVidPelajaranHuruf(9,0,"Dzal Berharakat Kasrah","dz6kejEOMuw"),
        DataVidPelajaranHuruf(10,0,"Ra Berharakat Kasrah","Vl6wNuQFyT0"),
        DataVidPelajaranHuruf(11,0,"Zayn Berharakat Kasrah","If0u90dumo4"),
        DataVidPelajaranHuruf(12,0,"Sin Berharakat Kasrah","Sw2CeqRO5io"),
        DataVidPelajaranHuruf(13,0,"Syin Berharakat Kasrah","1fAnO0rayPQ"),
        DataVidPelajaranHuruf(14,0,"Shod Berharakat Kasrah","2AadONAOWi0"),
        DataVidPelajaranHuruf(15,0,"Dhod Berharakat Kasrah","dr7FL0hgGlI"),
        DataVidPelajaranHuruf(16,0,"To Berharakat Kasrah","QhyQKd6XzWU"),
        DataVidPelajaranHuruf(17,0,"Zo Berharakat Kasrah","PlDEQMjbq2c"),
        DataVidPelajaranHuruf(18,0,"Ain Berharakat Kasrah","qIWizx3dfuM"),
        DataVidPelajaranHuruf(19,0,"Ghain Berharakat Kasrah","rh71lUOKgBE"),
        DataVidPelajaranHuruf(20,0,"Fa Berharakat Kasrah","ikgPz-gDEGA"),
        DataVidPelajaranHuruf(21,0,"Qaf Berharakat Kasrah","4qtIQLWgLEk"),
        DataVidPelajaranHuruf(22,0,"Kaf Berharakat Kasrah","6JVs8aeo2D8"),
        DataVidPelajaranHuruf(23,0,"Lam Berharakat Kasrah","LTrI62DeOGA"),
        DataVidPelajaranHuruf(24,0,"Mim Berharakat Kasrah","btjrSC7aDe0"),
        DataVidPelajaranHuruf(25,0,"Nun Berharakat Kasrah","0byc69KkxU0"),
        DataVidPelajaranHuruf(26,0,"Wau Berharakat Kasrah","YglXvs0T4XE"),
        DataVidPelajaranHuruf(27,0,"Ha Berharakat Kasrah","6VEPC_Kn4ag"),
        DataVidPelajaranHuruf(28,0,"Ya Berharakat Kasrah","sAr9seaJo1k")
    )

    private val hurufListDhammah: List<DataVidPelajaranHuruf> = listOf(
        DataVidPelajaranHuruf(1,0,"Alif Berharakat Dammah","3p55spJk46s"),
        DataVidPelajaranHuruf(2,0,"Ba Berharakat Dammah","5GZIedsx9zQ"),
        DataVidPelajaranHuruf(3,0,"Ta Berharakat Dammah","5-UbyYiIq9M"),
        DataVidPelajaranHuruf(4,0,"Tsa Berharakat Dammah","Y-dxKGP6FFE"),
        DataVidPelajaranHuruf(5,0,"Jim Berharakat Dammah","_P49xmOg_FM"),
        DataVidPelajaranHuruf(6,0,"Ha Berharakat Dammah","ho2mp7mcG84"),
        DataVidPelajaranHuruf(7,0,"Kho Berharakat Dammah","yuAiHzeXBtY"),
        DataVidPelajaranHuruf(8,0,"Dal Berharakat Dammah","92U_em94NpY"),
        DataVidPelajaranHuruf(9,0,"Dzal Berharakat Dammah","FC76mXWU_EY"),
        DataVidPelajaranHuruf(10,0,"Ra Berharakat Dammah","Vf26PyueaxY"),
        DataVidPelajaranHuruf(11,0,"Zayn Berharakat Dammah","87_IBOpsq24"),
        DataVidPelajaranHuruf(12,0,"Sin Berharakat Dammah","98IiZhFm_Nk"),
        DataVidPelajaranHuruf(13,0,"Syin Berharakat Dammah","QDPmqg2iSOs"),
        DataVidPelajaranHuruf(14,0,"Shod Berharakat Dammah","Exv3ZFToEnI"),
        DataVidPelajaranHuruf(15,0,"Dhod Berharakat Dammah","3p2zWs7d84Q"),
        DataVidPelajaranHuruf(16,0,"To Berharakat Dammah","DhneqkV2qwk"),
        DataVidPelajaranHuruf(17,0,"Zo Berharakat Dammah","GRTo3Pc4r1I"),
        DataVidPelajaranHuruf(18,0,"Ain Berharakat Dammah","VEY2nnIHtK8",),
        DataVidPelajaranHuruf(19,0,"Ghain Berharakat Dammah","ZYlDWl4I4eg"),
        DataVidPelajaranHuruf(20,0,"Fa Berharakat Dammah","-P_TgzRjFcE"),
        DataVidPelajaranHuruf(21,0,"Qaf Berharakat Dammah","GR2a8uLjcfE"),
        DataVidPelajaranHuruf(22,0,"Kaf Berharakat Dammah","Zh89LO0ogAo"),
        DataVidPelajaranHuruf(23,0,"Lam Berharakat Dammah","s5k__k9Yyhs"),
        DataVidPelajaranHuruf(24,0,"Mim Berharakat Dammah","mOS_jK54ryw"),
        DataVidPelajaranHuruf(25,0,"Nun Berharakat Dammah","rq7B6kLOH9w"),
        DataVidPelajaranHuruf(26,0,"Wau Berharakat Dammah","dfj8IJ_DvTw"),
        DataVidPelajaranHuruf(27,0,"Ha Berharakat Dammah","RY_v8-_aa1o"),
        DataVidPelajaranHuruf(28,0,"Ya Berharakat Dammah","U7goKOpzfzw")
    )


}
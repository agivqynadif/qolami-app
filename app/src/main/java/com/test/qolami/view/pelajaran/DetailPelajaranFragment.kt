package com.test.qolami.view.pelajaran

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.test.qolami.R
import com.test.qolami.databinding.FragmentDetailPelajaranBinding
import com.test.qolami.viewnodel.PelajaranHurufViewModel
import kotlin.math.log


class DetailPelajaranFragment : Fragment() {
    lateinit var binding : FragmentDetailPelajaranBinding
    private lateinit var pelajaranHurufViewModel: PelajaranHurufViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailPelajaranBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pelajaranHurufViewModel = ViewModelProvider(this).get(PelajaranHurufViewModel::class.java)
        pelajaranHurufViewModel.getDataDetail()
        pelajaranHurufViewModel.getDataHurufDetail.observe(this){
            getDetail()
        }
        binding.buttonLanjutkan.setOnClickListener {
            findNavController().navigate(R.id.action_detailPelajaranFragment_to_pelajaran1Fragment)
        }
    }
    private fun getDetail(){
        val args = this.arguments
        val dataBundle = args?.get("pelajaran")
        val detail = pelajaranHurufViewModel.listDataPelajaranDetail
        for(i in  detail.indices) {
            val indexPertama = detail[i].pelajaran
            if(indexPertama == dataBundle){
                binding.textPelajaran.text = detail[i].pelajaran
                binding.logoDetail.setImageResource(detail[i].logo)
                binding.textPelajaranDetail.text = detail[i].judulPelajaran
                binding.textHurufDetail.text = detail[i].namaPelajaran
                binding.textViewPenjelasan.text = detail[i].penjelasanPelajaran
            }
        }



    }

}
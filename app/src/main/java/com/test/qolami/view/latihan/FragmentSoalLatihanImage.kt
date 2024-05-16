package com.test.qolami.view.latihan

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.test.qolami.R
import com.test.qolami.databinding.FragmentSoalLatihanImageBinding
import com.test.qolami.viewnodel.LatihanHurufViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentSoalLatihanImage : Fragment() {
    private lateinit var binding : FragmentSoalLatihanImageBinding
    private lateinit var latihanHurufViewModel: LatihanHurufViewModel

    var indexYangDipilih: Int = 0
    var indexTerkini: Int = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentSoalLatihanImageBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        latihanHurufViewModel = ViewModelProvider(this).get(LatihanHurufViewModel::class.java)
        binding.option1.setOnClickListener {
            selectedOption(binding.txtJawaban1, binding.option1, 1)

        }
        binding.option2.setOnClickListener {
            selectedOption(binding.txtJawaban2, binding.option2, 2)
        }
        binding.option3.setOnClickListener {
            selectedOption(binding.txtJawaban3, binding.option3,3)
        }
        binding.option4.setOnClickListener {
            selectedOption(binding.txtJawaban4, binding.option4,4)
        }
        setSoal()
        binding.buttonCheckSoal.setOnClickListener {
            showBottomSheetDialog()
        }
    }

    private fun setSoal(){
        latihanHurufViewModel.getSoal()
        latihanHurufViewModel.dataSoalImage.observe(viewLifecycleOwner){
                binding.txtSoal.text = it.latihanHijaiyah[indexTerkini - 1].question
                binding.txtJawaban1.text = it.latihanHijaiyah[indexTerkini - 1].options[0]
                binding.txtJawaban2.text = it.latihanHijaiyah[indexTerkini - 1].options[1]
                binding.txtJawaban3.text = it.latihanHijaiyah[indexTerkini - 1].options[2]
                binding.txtJawaban4.text = it.latihanHijaiyah[indexTerkini - 1].options[3]

        }
        defaultStyle()
    }


    fun checkJawaban():Boolean{
        var indikator  = false
        latihanHurufViewModel = ViewModelProvider(this).get(LatihanHurufViewModel::class.java)
        latihanHurufViewModel.dataSoalImage.observe(viewLifecycleOwner) {
                if (indexYangDipilih!! - 1 == it.latihanHijaiyah[indexTerkini.minus(1)].correctIndex) {
                    indikator = true
                } else {
                    indikator = false
                }
        }
        return  indikator
    }
    fun lanjutkanSoal(){
        indexTerkini ++
        if (checkSoalSelesai() == true){
            latihanHurufViewModel.getSoal()
            defaultStyle()
        }

    }

    private fun checkSoalSelesai():Boolean{
        var indikatorSoal = false
        latihanHurufViewModel.dataSoalImage.observe(viewLifecycleOwner){
            if (indexTerkini > it.latihanHijaiyah.size){
                indikatorSoal = false
                findNavController().navigate(R.id.action_fragmentSoalLatihanImage_to_fragmentHasilLatihan)
            }else{
                indikatorSoal = true
            }
        }
        return indikatorSoal
    }
    private fun showBottomSheetDialog() {
        val bottomSheetDialogFragment = DialogFragmentJawaban()
        bottomSheetDialogFragment.isCancelable = false
        bottomSheetDialogFragment.show(childFragmentManager, bottomSheetDialogFragment.tag)
    }
    private fun defaultStyle(){
        val optionsText = ArrayList<TextView>()
        optionsText.add(0, binding.txtJawaban1)
        optionsText.add(1, binding.txtJawaban2)
        optionsText.add(2, binding.txtJawaban3)
        optionsText.add(3, binding.txtJawaban4)
        for (option in optionsText){
            option.setTextColor(resources.getColor(R.color.black))
        }
        val optionsCv = ArrayList<CardView>()
        optionsCv.add(0, binding.option1)
        optionsCv.add(1, binding.option2)
        optionsCv.add(2, binding.option3)
        optionsCv.add(3, binding.option4)
        for (optionCv in optionsCv){
            optionCv.setCardBackgroundColor(resources.getColor(R.color.white))
        }
    }
    private fun selectedOption(tv:TextView, cv:CardView, indexOption: Int){
        defaultStyle()
        indexYangDipilih = indexOption
        tv.setTextColor(resources.getColor(R.color.white))
        cv.setCardBackgroundColor(resources.getColor(R.color.warna_hijau_muda))
    }




}
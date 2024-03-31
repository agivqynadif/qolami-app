package com.test.qolami.view.pelajaran

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.test.qolami.R
import com.test.qolami.databinding.FragmentPelajaran1Binding
import com.test.qolami.view.adapter.PelajaranHuruf1Adapter
import com.test.qolami.view.pelajaran.data.DataMenuPelajaran1Huruf
import com.test.qolami.viewnodel.PelajaranHurufViewModel


class Pelajaran1Fragment : Fragment() {
    private lateinit var binding: FragmentPelajaran1Binding
    private lateinit var pelajaranHurufViewModel:PelajaranHurufViewModel
    private lateinit var pelajaranHuruf1Adapter: PelajaranHuruf1Adapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPelajaran1Binding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pelajaranHurufViewModel = ViewModelProvider(this).get(PelajaranHurufViewModel::class.java)
        layoutHurufPelajaran1()
        rcLayoutHurufPelajaran1()

    }

    private fun rcLayoutHurufPelajaran1(){
        pelajaranHurufViewModel = ViewModelProvider(this).get(PelajaranHurufViewModel::class.java)
        pelajaranHuruf1Adapter = PelajaranHuruf1Adapter(ArrayList())
        pelajaranHurufViewModel.getPelajaran1()
        binding.rcCon.layoutManager = GridLayoutManager(context, 5)
        binding.rcCon.adapter = pelajaranHuruf1Adapter
        pelajaranHurufViewModel.getDataPelajaran1.observe(viewLifecycleOwner) {
            pelajaranHuruf1Adapter.listHurufHijaiyah = it as ArrayList<DataMenuPelajaran1Huruf>
        }
    }
    private fun layoutHurufPelajaran1(){
        pelajaranHurufViewModel = ViewModelProvider(this).get(PelajaranHurufViewModel::class.java)
        var huruf = pelajaranHurufViewModel.listDataMenuPelajaran1
        for (i in huruf.indices){
            binding.textPelajaran.text = huruf[i].pelajaran
            binding.textJudul.text = huruf[i].judulPelajaran
        }
    }


}
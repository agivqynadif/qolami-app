package com.test.qolami.view.latihan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.test.qolami.R
import com.test.qolami.databinding.FragmentDetailLatihanHurufBinding
import dagger.hilt.android.AndroidEntryPoint



@AndroidEntryPoint
class FragmentDetailLatihanHuruf : Fragment() {
    private lateinit var binding: FragmentDetailLatihanHurufBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailLatihanHurufBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ivLatihanGambar.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentDetailLatihanHuruf_to_fragmentSoalLatihanImage)
        }
    }


}
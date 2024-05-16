package com.test.qolami.view.latihan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.test.qolami.R
import dagger.hilt.android.AndroidEntryPoint



@AndroidEntryPoint
class FragmentHasilLatihan : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hasil_latihan, container, false)
    }


}
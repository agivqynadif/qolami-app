package com.test.qolami.view.account

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.test.qolami.R
import com.test.qolami.databinding.FragmentAkunBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class AkunFragment : Fragment() {
    private lateinit var binding: FragmentAkunBinding
    private lateinit var sharedPreferences: SharedPreferences
    var token = ""
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAkunBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sharedPreferences = requireContext().getSharedPreferences("LOGIN", Context.MODE_PRIVATE)
        token  = sharedPreferences.getString("token", " ").toString()
        if (token.isNotEmpty()){
            binding.llProfile.setOnClickListener {
                findNavController().navigate(R.id.action_akunFragment_to_profileFragment)
            }
            binding.llChangePassword.setOnClickListener{
                findNavController().navigate((R.id.action_akunFragment_to_resetPasswordFragment))
            }
            binding.llLogout.setOnClickListener {
                sharedPreferences.edit().remove("token").apply()
                findNavController().navigate(R.id.action_akunFragment_to_homeFragment)
            }
        }
    }


}
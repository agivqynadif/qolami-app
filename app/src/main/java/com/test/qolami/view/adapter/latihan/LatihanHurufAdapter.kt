package com.test.qolami.view.adapter.latihan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.test.qolami.R
import com.test.qolami.databinding.DataLatihanHurufBinding

import com.test.qolami.view.latihan.data.DataLatihanHuruf

class LatihanHurufAdapter (var dataHuruf: ArrayList<DataLatihanHuruf>):RecyclerView.Adapter<LatihanHurufAdapter.ViewHolder>() {
    class ViewHolder(var binding: DataLatihanHurufBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = DataLatihanHurufBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataHuruf.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(holder.itemView).load(dataHuruf[position].logo).into(holder.binding.imageLogoLatihan)
        holder.binding.textLatihan.text = dataHuruf[position].latihan
        holder.binding.textPenjelasan.text = dataHuruf[position].penjelesan
        holder.binding.btnDetil.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("Latihan", dataHuruf[position].latihan)
            it.findNavController().navigate(R.id.action_fragmentLatihanHuruf_to_fragmentDetailLatihanHuruf, bundle)
        }
    }

}
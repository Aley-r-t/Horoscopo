package com.version1.horoscapp.ui.horoscope.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.version1.horoscapp.domain.model.HoroscopeInfo
import com.version1.horoscapp.databinding.ItemHoroscopeBinding

class HoroscopeViewHolder(view:View):RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)

    fun render(horoscopeInfo:HoroscopeInfo){
        val context = binding.tvTitle.context
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvTitle.text = context.getString(horoscopeInfo.name)

    }
}
package com.version1.horoscapp.ui.horoscope

import androidx.lifecycle.ViewModel
import com.version1.horoscapp.domain.model.HoroscopeInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class HoroscopeViewModel @Inject constructor():ViewModel() {

    val caja:String = "Hola Levi"

    fun getHoroscopes(){

        listOf(
            HoroscopeInfo.Aries, HoroscopeInfo.Taurus, HoroscopeInfo.Gemini
        )
    }
}
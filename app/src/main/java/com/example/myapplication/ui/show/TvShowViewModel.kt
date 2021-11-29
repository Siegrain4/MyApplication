package com.example.myapplication.ui.show

import androidx.lifecycle.ViewModel
import com.example.myapplication.data.CinemaData
import com.example.myapplication.utils.DataDummy

class TvShowViewModel: ViewModel() {
    fun getTvShow():List<CinemaData> = DataDummy.generateDummytvShow()
}
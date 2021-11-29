package com.example.myapplication.ui.movies

import androidx.lifecycle.ViewModel
import com.example.myapplication.data.CinemaData
import com.example.myapplication.utils.DataDummy

class MoviesViewModel: ViewModel() {
    fun getMovies( ):List<CinemaData> = DataDummy.generateDummymovies()
}
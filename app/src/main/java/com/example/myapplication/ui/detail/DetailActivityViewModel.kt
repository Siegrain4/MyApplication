package com.example.myapplication.ui.detail

import androidx.lifecycle.ViewModel
import com.example.myapplication.data.CinemaData
import com.example.myapplication.utils.DataDummy

class DetailActivityViewModel : ViewModel() {
    private lateinit var movieName: String
    private lateinit var showName: String

    fun setmovieName(movieName: String) {
        this.movieName = movieName
    }

    fun setshowName(showName: String) {
        this.showName = showName
    }

    fun getMovieDetail(): CinemaData {
        lateinit var result: CinemaData
        val listMovie = getListMovie()
        for (movie in listMovie) {
            if (movie.name == movieName) {
                result = movie
                break
            }
        }
        return result
    }

    fun getShowDetail(): CinemaData {
        lateinit var result: CinemaData
        val listTvShow = getListTvShow()
        for (tvShow in listTvShow) {
            if (tvShow.name == showName) {
                result = tvShow
                break
            }
        }
        return result
    }

    private fun getListMovie(): ArrayList<CinemaData> = DataDummy.generateDummymovies()
    private fun getListTvShow(): ArrayList<CinemaData> = DataDummy.generateDummytvShow()

}
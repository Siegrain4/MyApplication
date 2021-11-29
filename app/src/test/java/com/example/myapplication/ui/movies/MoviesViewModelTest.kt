package com.example.myapplication.ui.movies

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MoviesViewModelTest {
    private lateinit var viewModel:MoviesViewModel

    @Before
    fun setup(){
        viewModel = MoviesViewModel()
    }

    @Test
    fun getMovies(){
        val resultMovies = viewModel.getMovies()
        Assert.assertNotNull(resultMovies)
        Assert.assertEquals(10, resultMovies.size)
    }
}
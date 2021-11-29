package com.example.myapplication.ui.show

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class TvShowViewModelTest {
    private lateinit var viewModel: TvShowViewModel

    @Before
    fun setup(){
        viewModel = TvShowViewModel()
    }

    @Test
    fun getTvShow() {
        val resultShow = viewModel.getTvShow()
        Assert.assertNotNull(resultShow)
        Assert.assertEquals(10,resultShow.size)
    }
}
package com.example.myapplication.ui.detail

import com.example.myapplication.utils.DataDummy
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class DetailActivityViewModelTest {
    private lateinit var viewModel: DetailActivityViewModel
    private val dummyMovie = DataDummy.generateDummymovies()[5]
    private val dummyShow = DataDummy.generateDummytvShow()[5]
    private val movieName = dummyMovie.name
    private val showName = dummyShow.name

    @Before
    fun setup(){
        viewModel = DetailActivityViewModel()
    }

    @Test
    fun testGetMovieDetail() {
        viewModel.setmovieName(movieName)
        val result = viewModel.getMovieDetail()
        Assert.assertNotNull(result)
        Assert.assertEquals(dummyMovie.name, result.name)
        Assert.assertEquals(dummyMovie.synopsis, result.synopsis)
        Assert.assertEquals(dummyMovie.release, result.release)
        Assert.assertEquals(dummyMovie.images, result.images)
        Assert.assertEquals(dummyMovie.highlight, result.highlight)

    }

    @Test

    fun testGetShowDetail() {
        viewModel.setshowName(showName)
        val result = viewModel.getShowDetail()
        Assert.assertNotNull(result)
        Assert.assertEquals(dummyShow.name, result.name)
        Assert.assertEquals(dummyShow.synopsis, result.synopsis)
        Assert.assertEquals(dummyShow.release, result.release)
        Assert.assertEquals(dummyShow.images, result.images)
        Assert.assertEquals(dummyShow.highlight, result.highlight)
    }
}
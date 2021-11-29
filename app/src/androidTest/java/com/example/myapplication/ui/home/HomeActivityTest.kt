package com.example.myapplication.ui.home

import org.junit.Assert.*
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeLeft
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import com.example.myapplication.R
import com.example.myapplication.utils.DataDummy
import org.junit.Rule
import org.junit.Test

class HomeActivityTest{
    private val dummyMovie = DataDummy.generateDummymovies()
    private val dummyShow = DataDummy.generateDummytvShow()

    @get:Rule
    var activityRule = ActivityTestRule(HomeActivity::class.java)

    @Test
    fun loadMovie(){
        onView(withId(R.id.rv_movies))
            .check(matches(isDisplayed()))
        onView(withId(R.id.rv_movies))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyMovie.size))


    }
    @Test
    fun loadShow(){
        onView(isRoot())
            .perform(swipeLeft())
        onView(withId(R.id.rv_show))
            .check(matches(isDisplayed()))
        onView(withId(R.id.rv_show))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyShow.size))
    }

    @Test
    fun detailMovie(){
        onView(withId(R.id.rv_movies))
            .check(matches(isDisplayed()))
        onView(withId(R.id.rv_movies))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(5))
        onView(withId(R.id.rv_movies))
            .perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(5, click()))

        onView(withId(R.id.tv_item_name))
            .check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_release))
            .check(matches(isDisplayed()))
        onView(withId(R.id.synopsis))
            .check(matches(isDisplayed()))
        onView(withId(R.id.img_poster))
            .check(matches(isDisplayed()))
        onView(withId(R.id.imageView))
            .check(matches(isDisplayed()))

        onView(withId(R.id.tv_item_name))
            .check(matches(withText(dummyMovie[5].name)))
        onView(withId(R.id.synopsis))
            .check(matches(withText(dummyMovie[5].synopsis)))

        pressBack()
    }

    @Test
    fun detailShow(){
        onView(withText("Tv Show"))
            .perform(click())
        onView(withId(R.id.rv_show))
            .check(matches(isDisplayed()))
        onView(withId(R.id.rv_show))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(5))
        onView(withId(R.id.rv_show))
            .perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(5, click()))

        onView(withId(R.id.tv_item_name))
            .check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_release))
            .check(matches(isDisplayed()))
        onView(withId(R.id.synopsis))
            .check(matches(isDisplayed()))
        onView(withId(R.id.img_poster))
            .check(matches(isDisplayed()))
        onView(withId(R.id.imageView))
            .check(matches(isDisplayed()))

        onView(withId(R.id.tv_item_name))
            .check(matches(withText(dummyShow[5].name)))
        onView(withId(R.id.synopsis))
            .check(matches(withText(dummyShow[5].synopsis)))

        pressBack()
    }
}
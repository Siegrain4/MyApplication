package com.example.myapplication.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.myapplication.data.CinemaData
import com.example.myapplication.databinding.ActivityDetailBinding
import com.example.myapplication.databinding.ItemDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    private lateinit var result: CinemaData

    companion object {
        const val EXTRA_CINEMA = "extra_cinema"
        const val EXTRA_TYPE = "extra_type"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.apply {
            elevation = 0f
            setDisplayHomeAsUpEnabled(true)
        }

        val viewModel = ViewModelProvider(this@DetailActivity, ViewModelProvider.NewInstanceFactory())[DetailActivityViewModel::class.java]

        val cinema = intent.getParcelableExtra<CinemaData>(EXTRA_CINEMA) as CinemaData
        val type = intent.getStringExtra(EXTRA_TYPE)

        setActionBarname(cinema.name)
        result = if (type == "movies") {
            viewModel.setmovieName(cinema.name)
            viewModel.getMovieDetail()
        } else {
            viewModel.setshowName(cinema.name)
            viewModel.getShowDetail()
        }

        view(result)
    }

    private fun setActionBarname(name: String) {
        if (supportActionBar != null) {
            this.title = name
        }
    }

    /*private fun view(cinemaData: CinemaData) {
        Glide.with(this)
            .load(cinemaData.images)
            .into(binding.imagesDetail)

        binding.nameDetail.text = cinemaData.name
        binding.release.text = cinemaData.release
        binding.genreDuration.text = cinemaData.genre
        binding.synopsis.text = cinemaData.synopsis
    }*/
    private fun view(cinemaData: CinemaData) {
        Glide.with(this)
            .load(cinemaData.images)
            .into(binding.imgPoster)
        Glide.with(this)
            .load(cinemaData.highlight)
            .into(binding.imageView)

        binding.tvItemName.text = cinemaData.name
        binding.tvItemRelease.text = cinemaData.release
        binding.synopsis.text = cinemaData.synopsis
    }
}
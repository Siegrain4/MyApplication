package com.example.myapplication.ui.movies

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.data.CinemaData
import com.example.myapplication.databinding.ItemMovieBinding
import com.example.myapplication.ui.detail.DetailActivity

class MoviesAdapter : RecyclerView.Adapter<MoviesAdapter.ContentViewHolder>() {
    private var listMovies = ArrayList<CinemaData>()

    fun setMovies(movies: List<CinemaData>?) {
        if (movies == null) return
        this.listMovies.clear()
        this.listMovies.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentViewHolder {
        val itemMovieBinding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContentViewHolder(itemMovieBinding)
    }

    override fun onBindViewHolder(holder: ContentViewHolder, position: Int) {
        holder.bind(listMovies[position])
    }

    override fun getItemCount(): Int = listMovies.size

    inner class ContentViewHolder(private val binding: ItemMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movies: CinemaData) {
            binding.tvItemName.text = movies.name
            binding.tvItemRelease.text = movies.release
            Glide.with(itemView.context)
                .load(movies.images)
                .into(binding.imgPoster)

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_CINEMA, movies)
                intent.putExtra(DetailActivity.EXTRA_TYPE, "movies")
                itemView.context.startActivity(intent)
            }
        }
    }
}
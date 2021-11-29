package com.example.myapplication.ui.show

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.data.CinemaData
import com.example.myapplication.databinding.ItemShowBinding
import com.example.myapplication.ui.detail.DetailActivity

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.ContentViewHolder>() {
    private var listShow = ArrayList<CinemaData>()

    fun setTvShow(tvShow: List<CinemaData>?) {
        if (tvShow == null) return
        this.listShow.clear()
        this.listShow.addAll(tvShow)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentViewHolder {
        val itemShowBinding = ItemShowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContentViewHolder(itemShowBinding)
    }

    override fun onBindViewHolder(holder: ContentViewHolder, position: Int) {
        holder.bind(listShow[position])
    }

    override fun getItemCount(): Int = listShow.size

    inner class ContentViewHolder(private val binding: ItemShowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(tvShow: CinemaData) {
            binding.tvItemName.text = tvShow.name
            binding.tvItemRelease.text = tvShow.release
            Glide.with(itemView.context)
                .load(tvShow.images)
                .into(binding.imgPoster)

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_CINEMA, tvShow)
                intent.putExtra(DetailActivity.EXTRA_TYPE, "tvShow")
                itemView.context.startActivity(intent)
            }
        }
    }
}
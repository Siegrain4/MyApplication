package com.example.myapplication.ui.show

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class TvShowFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tv_show, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[TvShowViewModel::class.java]
        val tvShow = viewModel.getTvShow()

        val tvShowAdapter = TvShowAdapter()
        tvShowAdapter.setTvShow(tvShow)

        val rvTvShow: RecyclerView = view.findViewById(R.id.rv_show)
        rvTvShow.layoutManager = LinearLayoutManager(context)
        rvTvShow.setHasFixedSize(true)
        rvTvShow.adapter = tvShowAdapter
    }
}
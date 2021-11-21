package com.example.mvvmretrofit.sample_2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmretrofit.R
import com.example.mvvmretrofit.sample_2.mvvm.MovieRepository
import com.example.mvvmretrofit.sample_2.mvvm.MovieViewModel
import com.example.mvvmretrofit.sample_2.mvvm.MovieViewModelFactory

class MainActivity : AppCompatActivity() {

    lateinit var movieRepository: MovieRepository
    lateinit var movieViewModelFactory: MovieViewModelFactory
    lateinit var movieViewModel: MovieViewModel
    lateinit var recyclerView: RecyclerView
    lateinit var movieAdapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.s2_activity_main)

        initRecyclerView()

        movieRepository = MovieRepository()
        movieViewModelFactory = MovieViewModelFactory(movieRepository)
        movieViewModel = ViewModelProvider(
            this,
            movieViewModelFactory)[MovieViewModel::class.java]

        movieViewModel.getAllMovie()

        movieViewModel.myResponse.observe(this, Observer {
            movieAdapter.setMovieData(it as ArrayList<MovieModel>)
        })
    }

    private fun initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerview)
        movieAdapter = MovieAdapter(this,ArrayList())
        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager= LinearLayoutManager(this@MainActivity)
            adapter=movieAdapter
        }
    }
}
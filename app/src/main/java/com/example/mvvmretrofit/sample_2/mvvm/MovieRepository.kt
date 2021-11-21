package com.example.mvvmretrofit.sample_2.mvvm

import com.example.mvvmretrofit.sample_2.ui.MovieModel
import com.example.mvvmretrofit.sample_2.retrofit.MovieRetrofitBuilder

class MovieRepository {
    suspend fun getMovie() : List<MovieModel> =
        MovieRetrofitBuilder.api.getAllMovies()
}
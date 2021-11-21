package com.example.mvvmretrofit.sample_2.retrofit

import com.example.mvvmretrofit.sample_2.ui.MovieModel
import retrofit2.http.GET

interface MovieApi {
    @GET("movielist.json")
    suspend fun getAllMovies() : List<MovieModel>
}
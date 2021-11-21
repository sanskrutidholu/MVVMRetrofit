package com.example.mvvmretrofit.sample_2.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MovieRetrofitBuilder {
    companion object {
        private val retrofit : Retrofit by lazy {
            Retrofit.Builder()
                .baseUrl(MovieUrl.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        val api : MovieApi by lazy {
            retrofit.create(MovieApi::class.java)
        }

    }
}

package com.example.mvvmretrofit.sample_1.retrofit

import com.example.mvvmretrofit.sample_1.ui.Post
import retrofit2.http.GET

interface Api
{
    @GET("posts")
    suspend fun getAllPost(): List<Post>
}
package com.example.mvvmretrofit.sample_1.mvvm

import com.example.mvvmretrofit.sample_1.ui.Post
import com.example.mvvmretrofit.sample_1.retrofit.RetrofitBuilder

class PostRepository {
    suspend fun getPost() :List<Post> =
        RetrofitBuilder.api.getAllPost()
}
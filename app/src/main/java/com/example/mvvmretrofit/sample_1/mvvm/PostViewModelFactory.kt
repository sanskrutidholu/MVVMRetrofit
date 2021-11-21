package com.example.mvvmretrofit.sample_1.mvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class PostViewModelFactory(private val postRepository: PostRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T =
        PostViewModel(postRepository) as T
}
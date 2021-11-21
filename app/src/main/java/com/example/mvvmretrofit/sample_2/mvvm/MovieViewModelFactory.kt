package com.example.mvvmretrofit.sample_2.mvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MovieViewModelFactory(private val repository: MovieRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T =
        MovieViewModel(repository) as T

}
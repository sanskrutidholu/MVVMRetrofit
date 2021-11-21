package com.example.mvvmretrofit.sample_2.mvvm

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmretrofit.sample_2.ui.MovieModel
import kotlinx.coroutines.launch

class MovieViewModel(private val repository: MovieRepository) : ViewModel() {
    val myResponse  = MutableLiveData<List<MovieModel>>()

    fun getAllMovie() {
        viewModelScope.launch {
            try {
                val response = repository.getMovie()
                myResponse.value = response
            } catch (e:Exception) {
                Log.d("main", "getPost: ${e.message}")
            }
        }

    }
}
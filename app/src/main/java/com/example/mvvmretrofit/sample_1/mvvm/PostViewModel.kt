package com.example.mvvmretrofit.sample_1.mvvm

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmretrofit.sample_1.ui.Post
import kotlinx.coroutines.launch

class PostViewModel(private val postRepository: PostRepository) : ViewModel() {
    val myResponse: MutableLiveData<List<Post>> = MutableLiveData()
    fun getPost()
    {
        viewModelScope.launch{
            try{
                val response = postRepository.getPost()
                myResponse.value = response

            }catch (e:Exception){
                Log.d("main", "getPost: ${e.message}")
            }
        }
    }
}
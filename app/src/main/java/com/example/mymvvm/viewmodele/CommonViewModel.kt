package com.example.mymvvm.viewmodele

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mymvvm.repository.Repository

class CommonViewModel(
    val repository: Repository
) : ViewModel(){
    fun textChange() = "WORLD NEW HELLO"
}
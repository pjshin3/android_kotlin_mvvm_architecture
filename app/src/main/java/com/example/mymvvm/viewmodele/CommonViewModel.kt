package com.example.mymvvm.viewmodele

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommonViewModel : ViewModel(){
    fun textChange() = "WORLD NEW HELLO"
}
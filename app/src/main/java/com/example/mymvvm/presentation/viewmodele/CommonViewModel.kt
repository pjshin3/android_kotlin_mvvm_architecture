package com.example.mymvvm.presentation.viewmodele

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mymvvm.domain.BookListUseCase
import com.example.mymvvm.domain.TmpModelUesCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.random.Random

class CommonViewModel(
    private val tmpModelUesCase: TmpModelUesCase,
    private val bookListUseCase: BookListUseCase
) : ViewModel(){

    private var _tmpLivedata : MutableLiveData<String> = MutableLiveData()
    val tmpLiveData : LiveData<String>
        get() = _tmpLivedata

    fun getSomeString() {
        viewModelScope.launch {
            withContext(Dispatchers.IO){
                val tmpList = arrayListOf("test","rich","benz","bmw","idol","love","kotlin")
                bookListUseCase(tmpList[Random.nextInt(tmpList.lastIndex)])
            }
        }
    }
}
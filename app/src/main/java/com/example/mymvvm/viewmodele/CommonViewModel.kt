package com.example.mymvvm.viewmodele

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mymvvm.domain.SomeStringUseCase
import com.example.mymvvm.domain.TmpModelUesCase
import kotlinx.coroutines.launch

class CommonViewModel(
    private val tmpModelUesCase: TmpModelUesCase,
    private val someStringUseCase: SomeStringUseCase
) : ViewModel(){

    private var _tmpLivedata : MutableLiveData<String> = MutableLiveData()
    val tmpLiveData : LiveData<String>
        get() = _tmpLivedata

    fun getSomeTmpModel() = tmpModelUesCase("")
    fun getSomeString() {
        _tmpLivedata.postValue( someStringUseCase(Unit) )
    }
}
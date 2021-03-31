package com.example.mymvvm.viewmodele

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mymvvm.data.TmpDataModel
import com.example.mymvvm.repository.Repository

class CommonViewModel(
    val repository: Repository
) : ViewModel(){

    private var _tmpLivedata : MutableLiveData<String> = MutableLiveData()
    val tmpLiveData : LiveData<String>
        get() = _tmpLivedata

    fun getApiSomeText() {
        _tmpLivedata.postValue(repository.getApiSomeString())
    }
    fun getDatabaseSomeModel(): TmpDataModel = repository.getDatabaseTmpmodel()
}
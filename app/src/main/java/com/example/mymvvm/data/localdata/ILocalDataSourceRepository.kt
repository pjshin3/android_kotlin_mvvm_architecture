package com.example.mymvvm.data.localdata

import com.example.mymvvm.data.localdata.TmpDataModel

interface ILocalDataSourceRepository {
    fun getTmpmodel(): TmpDataModel
}
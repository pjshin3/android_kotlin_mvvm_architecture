package com.example.mymvvm.repository

import com.example.mymvvm.data.Appdatabase
import com.example.mymvvm.data.TmpDataModel

interface IDatabaseService {
    fun getTmpmodel(): TmpDataModel
}
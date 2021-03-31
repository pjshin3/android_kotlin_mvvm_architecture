package com.example.mymvvm.repository

import android.util.Log
import com.example.mymvvm.api.Apiservice
import com.example.mymvvm.data.Appdatabase
import com.example.mymvvm.data.TmpDataModel
import kotlin.random.Random

class Repository(
    private val database: Appdatabase,
    private val remoteService: com.example.mymvvm.api.Apiservice
){
    fun getApiSomeString() = ApiSourceFactory(remoteService).getString()

    fun getDatabaseTmpmodel() = DatabaseSourceFactory(database).getTmpmodel()

    private inner class ApiSourceFactory (
        private val api: Apiservice
        ): IApiservice {

        override fun getString(): String {
            val tmpList = arrayListOf("test","rich","benz","bmw","idol","BTS","love","kotlin","RX","rick owen","Mason")
            return tmpList[Random.nextInt(tmpList.lastIndex)]
        }
    }

    private inner class DatabaseSourceFactory(
        private val database: Appdatabase
    ): IDatabaseService {
        override fun getTmpmodel(): TmpDataModel {
            return TmpDataModel(1231231L , "philip")
        }

    }
}
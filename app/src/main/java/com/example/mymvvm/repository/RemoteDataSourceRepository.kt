package com.example.mymvvm.repository

import com.example.mymvvm.api.Apiservice
import kotlin.random.Random

class RemoteDataSourceRepository(
    api: Apiservice
):IRemoteDataSourceRepository {
    override fun getString(): String {
        val tmpList = arrayListOf("test","rich","benz","bmw","idol","BTS","love","kotlin","RX","rick owen","Mason")
        return tmpList[Random.nextInt(tmpList.lastIndex)]
    }
}
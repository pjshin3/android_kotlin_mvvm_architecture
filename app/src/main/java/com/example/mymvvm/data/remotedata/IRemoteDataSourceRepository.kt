package com.example.mymvvm.data.remotedata

import org.json.JSONObject

interface IRemoteDataSourceRepository{
    suspend fun getbookList(pram: String) : JSONObject
}
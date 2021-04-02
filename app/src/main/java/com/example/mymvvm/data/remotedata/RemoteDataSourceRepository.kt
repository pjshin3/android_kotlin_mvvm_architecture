package com.example.mymvvm.data.remotedata

import android.util.Log
import com.google.gson.JsonObject
import org.json.JSONObject
import kotlin.random.Random

class RemoteDataSourceRepository(
    private val api: Apiservice
): IRemoteDataSourceRepository {
    override suspend fun getbookList(pram: String): JSONObject {
        val result =  api.getBooklist(pram).execute().apply {
            if (code() == 200){
                body()
                Log.e("philip","${body()}")
            }else{
                JsonObject()
            }
        }
        return  JSONObject()
    }
}
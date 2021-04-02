package com.example.mymvvm.data.remotedata

import com.google.gson.JsonObject
import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.Query

interface Apiservice {

    @GET("/books/v1/volumes/")
    fun getBooklist(@Query("q") q: String): Call<JsonObject>
}
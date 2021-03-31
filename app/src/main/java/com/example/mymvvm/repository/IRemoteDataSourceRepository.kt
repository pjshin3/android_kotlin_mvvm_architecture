package com.example.mymvvm.repository

import com.example.mymvvm.api.Apiservice

interface IRemoteDataSourceRepository{
    fun getString() : String
}
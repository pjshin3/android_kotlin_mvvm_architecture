package com.example.mymvvm.repository

import com.example.mymvvm.api.Apiservice
import com.example.mymvvm.data.Appdatabase

class Repository(database: Appdatabase, remoteService: Apiservice) : RemoteRepo , LocalRepo {

}
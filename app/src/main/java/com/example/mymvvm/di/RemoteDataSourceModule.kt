package com.example.mymvvm.di

import com.example.mymvvm.data.remotedata.IRemoteDataSourceRepository
import com.example.mymvvm.data.remotedata.RemoteDataSourceRepository
import org.koin.dsl.module

val remoteDataSourceModule = module {
    single<IRemoteDataSourceRepository> { RemoteDataSourceRepository(api = get()) }
}
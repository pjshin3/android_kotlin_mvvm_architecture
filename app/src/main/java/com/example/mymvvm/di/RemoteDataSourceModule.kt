package com.example.mymvvm.di

import com.example.mymvvm.repository.IRemoteDataSourceRepository
import com.example.mymvvm.repository.RemoteDataSourceRepository
import org.koin.dsl.module

val remoteDataSourceModule = module {
    single<IRemoteDataSourceRepository> { RemoteDataSourceRepository(api = get()) }
}
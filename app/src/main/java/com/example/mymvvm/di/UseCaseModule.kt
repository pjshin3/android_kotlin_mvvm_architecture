package com.example.mymvvm.di

import com.example.mymvvm.domain.SomeStringUseCase
import com.example.mymvvm.domain.TmpModelUesCase
import com.example.mymvvm.data.localdata.ILocalDataSourceRepository
import com.example.mymvvm.data.remotedata.IRemoteDataSourceRepository
import org.koin.dsl.module

val useCaseModule = module {
    single { provideTmpModelUseCase(get()) }
    single { provideSomeStringUseCase(get()) }
}

internal fun provideTmpModelUseCase(localDataSourceRepository: ILocalDataSourceRepository): TmpModelUesCase =
    TmpModelUesCase(localDataSourceRepository)

internal fun provideSomeStringUseCase(remoteDataSourceRepository: IRemoteDataSourceRepository): SomeStringUseCase =
    SomeStringUseCase(remoteDataSourceRepository)
package com.example.mymvvm

import android.app.Application
import com.example.mymvvm.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(
                listOf(
                    viewModelModule,
                    networkModule,
                    localDataSoruceModule,
                    remoteDataSourceModule,
                    useCaseModule
                )
            )
        }
    }
}
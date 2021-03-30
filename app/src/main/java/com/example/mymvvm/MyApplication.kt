package com.example.mymvvm

import android.app.Application
import com.example.mymvvm.di.apiServiceModule
import com.example.mymvvm.di.appModule
import com.example.mymvvm.di.databaseModule
import com.example.mymvvm.di.viewmodelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(
                listOf(
                    viewmodelModule,
                    apiServiceModule,
                    databaseModule,
                    appModule
                )
            )
        }
    }
}
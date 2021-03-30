package com.example.mymvvm

import android.app.Application
import com.example.mymvvm.di.viewmodelModule
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                listOf(
                    viewmodelModule
                )
            )
        }
    }
}
package com.example.mymvvm.di

import androidx.room.Room
import com.example.mymvvm.data.Appdatabase
import com.example.mymvvm.data.TmpDataDao
import com.example.mymvvm.repository.ILocalDataSourceRepository
import com.example.mymvvm.repository.LocalDataSoruceRepository
import com.example.mymvvm.utiles.Defind
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val localDataSoruceModule = module {
    single { Room
        .databaseBuilder(androidContext(), Appdatabase::class.java, Defind.APP_DATABASE_NAME)
        .build() }
    single { provideTmpDao(database = get()) }

    single<ILocalDataSourceRepository> { LocalDataSoruceRepository(tmpDataDao = get()) }
}

internal fun provideTmpDao(database: Appdatabase): TmpDataDao = database.getTmpDataDao()
package com.example.mymvvm.di

import androidx.room.Room
import com.example.mymvvm.data.localdata.AppDatabase
import com.example.mymvvm.data.localdata.TmpDataDao
import com.example.mymvvm.data.localdata.ILocalDataSourceRepository
import com.example.mymvvm.data.localdata.LocalDataSoruceRepository
import com.example.mymvvm.utiles.Defind
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val localDataSoruceModule = module {
    single { Room
        .databaseBuilder(androidContext(), AppDatabase::class.java, Defind.APP_DATABASE_NAME)
        .build() }
    single { provideTmpDao(database = get()) }

    single<ILocalDataSourceRepository> { LocalDataSoruceRepository(tmpDataDao = get()) }
}

internal fun provideTmpDao(database: AppDatabase): TmpDataDao = database.getTmpDataDao()
package com.example.mymvvm.data

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [TmpDataModel::class], version = 1)
abstract class Appdatabase : RoomDatabase() {
    abstract fun getTmpDataDao() : TmpDataDao
}
package com.example.mymvvm.data.localdata

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [TmpDataModel::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getTmpDataDao() : TmpDataDao
}
package com.example.mymvvm.repository

import com.example.mymvvm.data.TmpDataDao
import com.example.mymvvm.data.TmpDataModel

class LocalDataSoruceRepository(
    val tmpDataDao: TmpDataDao
): ILocalDataSourceRepository {
    override fun getTmpmodel(): TmpDataModel {
        return TmpDataModel(12312L,"philip")
    }
}
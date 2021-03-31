package com.example.mymvvm.data.localdata

class LocalDataSoruceRepository(
    val tmpDataDao: TmpDataDao
): ILocalDataSourceRepository {
    override fun getTmpmodel(): TmpDataModel {
        return TmpDataModel(12312L,"philip")
    }
}
package com.example.mymvvm.domain

import com.example.mymvvm.data.localdata.TmpDataModel
import com.example.mymvvm.data.localdata.ILocalDataSourceRepository

typealias ITmpModelUseCase = BaseUsesCase<String, TmpDataModel>

class TmpModelUesCase(
    private val localDataSoruceRepository: ILocalDataSourceRepository
): ITmpModelUseCase {
    override fun invoke(pram: String): TmpDataModel = localDataSoruceRepository.getTmpmodel()
}
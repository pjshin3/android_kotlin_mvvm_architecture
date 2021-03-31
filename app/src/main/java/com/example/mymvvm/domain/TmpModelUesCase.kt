package com.example.mymvvm.domain

import com.example.mymvvm.data.TmpDataModel
import com.example.mymvvm.repository.ILocalDataSourceRepository
import com.example.mymvvm.repository.LocalDataSoruceRepository

typealias ITmpModelUseCase = BaseUsesCase<String, TmpDataModel>

class TmpModelUesCase(
    private val localDataSoruceRepository: ILocalDataSourceRepository
): ITmpModelUseCase {
    override fun invoke(pram: String): TmpDataModel = localDataSoruceRepository.getTmpmodel()
}
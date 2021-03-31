package com.example.mymvvm.domain

import com.example.mymvvm.data.remotedata.IRemoteDataSourceRepository

typealias ISomeStringUseCase = BaseUsesCase<Unit,String>

class SomeStringUseCase(
    private val remoteDataSourceRepository: IRemoteDataSourceRepository
): ISomeStringUseCase {
    override fun invoke(pram: Unit): String = remoteDataSourceRepository.getString()
}
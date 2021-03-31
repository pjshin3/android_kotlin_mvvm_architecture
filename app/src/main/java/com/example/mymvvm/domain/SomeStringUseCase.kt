package com.example.mymvvm.domain

import com.example.mymvvm.repository.IRemoteDataSourceRepository
import com.example.mymvvm.repository.RemoteDataSourceRepository

typealias ISomeStringUseCase = BaseUsesCase<Unit,String>

class SomeStringUseCase(
    private val remoteDataSourceRepository: IRemoteDataSourceRepository
): ISomeStringUseCase {
    override fun invoke(pram: Unit): String = remoteDataSourceRepository.getString()
}
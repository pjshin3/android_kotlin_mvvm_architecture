package com.example.mymvvm.domain

import android.util.Log
import com.example.mymvvm.data.remotedata.IRemoteDataSourceRepository

typealias ISomeStringUseCase = BaseUsesCase<String,String>

class BookListUseCase(
    private val remoteDataSourceRepository: IRemoteDataSourceRepository
): ISomeStringUseCase {
    override suspend fun invoke(pram: String): String {
        val result = remoteDataSourceRepository.getbookList(pram)
        Log.e("philip","$result")
        return ""
    }
}
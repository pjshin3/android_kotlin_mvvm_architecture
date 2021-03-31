package com.example.mymvvm.di

import com.example.mymvvm.viewmodele.CommonViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { CommonViewModel( tmpModelUesCase = get(), someStringUseCase = get()) }
}
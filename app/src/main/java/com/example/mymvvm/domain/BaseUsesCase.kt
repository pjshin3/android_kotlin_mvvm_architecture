package com.example.mymvvm.domain

interface BaseUsesCase<in Prameter, out Result> {
    suspend operator fun invoke(pram: Prameter) : Result
}
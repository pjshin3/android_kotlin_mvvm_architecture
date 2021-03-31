package com.example.mymvvm.domain

interface BaseUsesCase<in Prameter, out Result> {
    operator fun invoke(pram: Prameter) : Result
}
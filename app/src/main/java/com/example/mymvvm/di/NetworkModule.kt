package com.example.mymvvm.di

import com.example.mymvvm.BuildConfig
import com.example.mymvvm.data.remotedata.Apiservice
import com.example.mymvvm.utiles.Defind
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val networkModule = module {

    single { provideOkHttpClient() }

    single { provideRetrofit(okHttpClient = get()) }

    single { provideApiService(retrofit = get()) }
}

internal fun provideOkHttpClient(): OkHttpClient {

    return OkHttpClient.Builder()
        .connectTimeout(Defind.CONNECT_TIMEOUT, TimeUnit.SECONDS)
        .writeTimeout(Defind.WRITE_TIMEOUT, TimeUnit.SECONDS)
        .readTimeout(Defind.READ_ITEMOUT, TimeUnit.SECONDS)
        .addInterceptor(Interceptor{ chain ->
            chain.proceed(chain
                .request()
                .newBuilder()
                .header("Accept", "application/json")
                .build()
            )
        })
        .addInterceptor(HttpLoggingInterceptor().apply {
            if (BuildConfig.DEBUG){
                level = HttpLoggingInterceptor.Level.BODY
            }
        })
        .build()
}

internal fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return  Retrofit.Builder()
        .baseUrl(Defind.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()
}

internal fun provideApiService(retrofit: Retrofit): Apiservice =
    retrofit.create(Apiservice::class.java)

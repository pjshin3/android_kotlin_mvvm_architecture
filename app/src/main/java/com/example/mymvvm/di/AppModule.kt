package com.example.mymvvm.di

import androidx.room.Room
import com.example.mymvvm.BuildConfig
import com.example.mymvvm.api.Apiservice
import com.example.mymvvm.data.Appdatabase
import com.example.mymvvm.repository.Repository
import com.example.mymvvm.utiles.Defind
import com.example.mymvvm.viewmodele.CommonViewModel
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val apiServiceModule = module {

    single { OkHttpClient.Builder()
            .connectTimeout(Defind.CONNECT_TIMEOUT, TimeUnit.SECONDS)
            .writeTimeout(Defind.WRITE_TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(Defind.READ_ITEMOUT, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
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
            .build() }

    single { Retrofit.Builder()
            .baseUrl(Defind.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build() }

    single(createdAtStart = false) { get<Retrofit>().create(Apiservice::class.java) }
}

val databaseModule = module {
    single { Room.databaseBuilder(androidContext(), Appdatabase::class.java, Defind.APP_DATABASE_NAME).build() }
}

val appModule = module {
    single { Repository(get(), get()) }
}

val viewmodelModule = module {
    viewModel { CommonViewModel(get()) }
}
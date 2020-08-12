package com.example.kotlin_singleton_example.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MyRetrofitBuilder {
    private const val BASE_URL: String = "https://open-api.xyz/"
    private val retrofitBuilder: Retrofit.Builder by lazy { Retrofit.Builder(
        )
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
    }
    val serviceApi:ServiceApi by lazy {
        retrofitBuilder
            .build()
            .create(ServiceApi::class.java)
    }
}
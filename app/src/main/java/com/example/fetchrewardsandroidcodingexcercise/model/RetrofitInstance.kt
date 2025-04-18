package com.example.fetchrewardsandroidcodingexcercise.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://fetch-hiring.s3.amazonaws.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: ListApiService by lazy {
        retrofit.create(ListApiService::class.java)
    }
}
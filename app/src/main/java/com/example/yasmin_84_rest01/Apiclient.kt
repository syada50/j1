package com.example.yasmin_84_rest01

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Apiclient {
    val retrofit= Retrofit.Builder()
        .baseUrl("https://api.escuelajs.co/api/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val apiService= retrofit.create(ApiService::class.java)
}
package com.example.flowersapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object HttpClient {

    private val retrofit = Retrofit.Builder()
        .baseUrl("http://services.hanselandpetal.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getClient() : Retrofit = retrofit
}
package com.example.flowersapp

import com.example.flowersapp.model.Flower
import kotlinx.coroutines.Deferred
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET



interface FlowersApi {
    @GET("feeds/flowers.json")
   suspend fun getData(): Deferred<Response<List<Flower>>>


}
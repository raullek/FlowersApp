package com.example.flowersapp

import com.example.flowersapp.model.Flower
import retrofit2.Call
import retrofit2.Retrofit

class FlowersRepository : BaseRepository() {

    var client = HttpClient.getClient().create(FlowersApi::class.java)

    suspend fun getFlowers () :List<Flower>?{

       val flowerResponse = safeApiCall(
           call = {client.getData().await()},
           errorMessage = "Error fetching flowers"
       )
        return flowerResponse
   }


}
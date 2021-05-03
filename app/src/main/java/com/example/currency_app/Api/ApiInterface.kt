package com.example.currency_app.Api

import com.example.currency_app.Util.contstants.Companion.API_KEY
import com.example.currency_app.entity.latestResponse
import com.example.currency_app.gen_1
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("v1/latest")
    suspend fun getlatest(
        @Query("base")
        base : String = "USD",
        @Query("api_key")
        key :String = API_KEY,

    ): Response<gen_1>


}
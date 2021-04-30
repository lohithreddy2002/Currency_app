package com.example.currency_app.Api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class Retrofitinstance {

    companion object{
        private val retrofitinstance by lazy{
val logging =HttpLoggingInterceptor()

            val client = OkHttpClient.Builder().addInterceptor(logging)
                .build()

            Retrofit.Builder().baseUrl("https://api.currencyscoop.com")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client).build()
        }
        val api by lazy {
retrofitinstance.create(ApiInterface::class.java)
        }
    }
}
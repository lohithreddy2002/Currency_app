package com.example.currency_app

data class Response(
    val base: String,
    val date: String,
    val rates: Rates
)
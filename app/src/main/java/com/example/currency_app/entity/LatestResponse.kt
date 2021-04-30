package com.example.currency_app.entity

import com.example.currency_app.entity.Rates

data class latestResponse(
    val base: String,
    val date: String,
    val rates: Rates
)
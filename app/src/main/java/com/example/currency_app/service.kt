package com.example.currency_app

val a = listOf<String>(
    "hi",
    "hello",
    "namesthe"
)

class service : inter {

    override suspend fun getall_items(): List<String> {
        return a
    }
}
package com.example.currency_app

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class factory(val repo: service) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return Viewmodel(repo) as T
    }
}
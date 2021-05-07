package com.example.currency_app

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class Viewmodel(
    val repo: service
) : ViewModel() {

    var x: MutableLiveData<List<String>> = MutableLiveData()

    init {
        fetchitems()
    }

    fun fetchitems() {
        viewModelScope.launch {
            val a = repo.getall_items()
            x.postValue(a);
        }
    }
}
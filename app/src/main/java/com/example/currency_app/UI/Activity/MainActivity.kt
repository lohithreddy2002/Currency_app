package com.example.currency_app.UI.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.currency_app.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viwmodel: Viewmodel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val repository = service()
        val factory = factory(repository)

        viwmodel = ViewModelProvider(this, factory).get(Viewmodel::class.java)
        bottom_nav.setupWithNavController(recycle.findNavController())
    }
}
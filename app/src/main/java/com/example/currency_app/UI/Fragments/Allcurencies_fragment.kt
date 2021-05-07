package com.example.currency_app.UI.Fragments

import android.content.Context.BATTERY_SERVICE
import android.os.BatteryManager
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.example.currency_app.R
import com.example.currency_app.UI.Activity.MainActivity
import com.example.currency_app.Viewmodel

class Allcurencies_fragment : Fragment() {
    // TODO: Rename and change types of parameters
    lateinit var viewmdel: Viewmodel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_allcurencies_fragment, container, false)
    }

    override fun onStart() {
        super.onStart()
        val d = Log.d("tag", "happy ga vundu bro")
        val but = view?.findViewById<Button>(R.id.but)

        but?.setOnClickListener {
            val bm = this.context?.getSystemService(BATTERY_SERVICE) as BatteryManager
            val level = bm.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY)

            Toast.makeText(this.context, "$level", Toast.LENGTH_SHORT).show()
        }

        viewmdel = (activity as MainActivity).viwmodel

        viewmdel.x.observe(viewLifecycleOwner, Observer {
            Log.i("string", "$it")
        })

    }
}


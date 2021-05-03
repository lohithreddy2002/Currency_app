package com.example.currency_app.UI.Fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.currency_app.All_currencies_adapter
import com.example.currency_app.Api.Retrofitinstance
import com.example.currency_app.R
import com.example.currency_app.UI.Activity.MainActivity
import kotlinx.android.synthetic.main.fragment_allcurencies_fragment.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Allcurencies_fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var aadapter:All_currencies_adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_allcurencies_fragment, container, false)
    }

    override  fun onStart() {
        super.onStart()
        Log.d("tag","hais")
late()





    }

    private fun setrecycle() {
        aadapter = All_currencies_adapter()
        re.apply {
            adapter = aadapter
            layoutManager = LinearLayoutManager(activity)
        }
    }


    fun late() = GlobalScope.launch {
        val x = Retrofitinstance.api.getlatest()
        Log.i("network","${x.body()}")
        Log.i("network", x.message())
        Log.i("network","$x")


    }
}
package com.jetsada.kotlinscopefunctions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private var number: Int? = null
    private var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //let
       val x = number?.let {
            val number2 = it + 1
            number2
        } ?: 3

        //apply
       val apply = Intent().apply {
            putExtra("","")
            putExtra("",0)
            action = ""
        }

        //run
        val run = Intent().run {
            putExtra("","")
            putExtra("",0)
            action = ""
            this
        }

        //with
        with(Intent()) {

        }
    }

    //also
    fun getSquardI() = (i * i).also {
        i++
    }
}
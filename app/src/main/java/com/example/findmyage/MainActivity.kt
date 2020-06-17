package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        btnGetAge.setOnClickListener {
//            val yearOfBirth : Int = edtDOB.text.toString().toInt()
//            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
//            val myAge = currentYear - yearOfBirth
//            txtShowAge.text = myAge.toString()
////            txtShowAge.text = "Your age is $myAge"
//        }

    }

    fun btnFindAge(view: View) {
        val yearOfBirth : Int = edtDOB.text.toString().toInt()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val myAge = currentYear - yearOfBirth
        txtShowAge.text = myAge.toString()
    }
}

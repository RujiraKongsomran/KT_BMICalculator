package com.rujirakongsomran.kt_bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculate.setOnClickListener {
            val h = (etHeight.text).toString().toFloat() / 100;
            val w = etWeight.text.toString().toFloat()
            val bmi = w / (h * h)

            tvResult.text = "%.2f".format(bmi)
        }
    }
}
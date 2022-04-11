package com.example.eduapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val investArray = arrayOf(120000, 80000, 50000, 45000, 23000, 71000)
    val profitArray = arrayOf(142000, 94000, 62000, 51000, 24000, 77000)
    val resultArray = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val names = resources.getStringArray(R.array.names)
        for ((index, name) in names.withIndex()){
            resultArray.add("Name: $name - profit = ${investArray[index] - profitArray[index]}")
            Log.d("MyActLog", "Output Data -/- ${resultArray[index]}")
        }

    }
}
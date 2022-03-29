package com.example.eduapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MylogMAct", "onCreate")
    }
    override fun onStart() {
        super.onStart()
        Log.d("MylogMAct", "onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.d("MylogMAct", "onResume")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MylogMAct", "onDestroy")
    }
    override fun onStop() {
        super.onStop()
        Log.d("MylogMAct", "onStop")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("MylogMAct", "onRestart")
    }
}
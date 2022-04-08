package com.example.eduapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.eduapplication.databinding.ActivityMainBinding

class SingActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    override fun onCreate(myArg: Bundle?){
        super.onCreate(myArg)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }
}
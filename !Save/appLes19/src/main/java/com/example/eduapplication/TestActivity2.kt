package com.example.eduapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.eduapplication.constance.Constance
import com.example.eduapplication.databinding.ActivitySignBinding

class TestActivity2 : AppCompatActivity() {
    lateinit var bindingClass: ActivitySignBinding

    override fun onCreate(myArg: Bundle?){
        super.onCreate(myArg)
        bindingClass = ActivitySignBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)


    }

}
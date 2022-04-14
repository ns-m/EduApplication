package com.example.eduapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun onClickButtonTest(view: View){
        val intent = Intent()
        intent.putExtra("key1", "send text")
        setResult(RESULT_OK, intent)
        finish()
    }
}
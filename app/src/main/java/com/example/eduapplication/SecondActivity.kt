package com.example.eduapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.eduapplication.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val message = intent.getStringExtra("keySend")
        bindingClass.transmittedData.text = message
    }
    fun onClickBack(view: View){
        intent.putExtra("keySendAnsw", bindingClass.inputName.text.toString())
        setResult(RESULT_OK, intent)
        finish()
    }
/*    fun onClickClose(view: View){
        finish()
    }*/
}
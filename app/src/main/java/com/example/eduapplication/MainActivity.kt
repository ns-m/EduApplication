package com.example.eduapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.eduapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
/*    override fun onCreate(savedInstanceState: Bundle?) {
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
    }*/
    lateinit var bindingClass: ActivityMainBinding
    var numberX:Int = 324
    var numberY:Int = 24
    override fun onCreate(myArg: Bundle?){
        super.onCreate(myArg)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
/*        bindingClass.magicButton.setOnClickListener{
            bindingClass.magicTextView.visibility = View.GONE
        }*/
        bindingClass.addButton.setOnClickListener{
            val result = numberX + numberY
            bindingClass.numbersResult.text = "Result ADD = $result"
        }
        bindingClass.subtractButton.setOnClickListener{
            val result = numberX - numberY
            bindingClass.numbersResult.text = "Result Subtract = $result"
        }
        bindingClass.multiplyButton.setOnClickListener{
            val result = numberX * numberY
            bindingClass.numbersResult.text = "Result Multiply = $result"
        }
    }
}
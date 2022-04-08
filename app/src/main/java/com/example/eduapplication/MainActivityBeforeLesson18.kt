package com.example.eduapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.util.Log
import android.view.View
import com.example.eduapplication.constance.Constance
import com.example.eduapplication.databinding.ActivityMainBinding

class MainActivityBeforeLesson18 : AppCompatActivity() {
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
/*    var numberX:Int = 324
    var numberY:Int = 24*/
    override fun onCreate(myArg: Bundle?){
        super.onCreate(myArg)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 100 && resultCode == RESULT_OK && data != null){
            bindingClass.getAnswer?.text = data.getStringExtra("keySendAnsw")
        }

    }

    fun onClickSendDataSecond(view: View){
        val secondActivity = Intent(this, SecondActivity::class.java)
        secondActivity.putExtra("keySend", "What is your name?")
        startActivityForResult(secondActivity, 100)
    }
/*    fun onClickGoSecond(view: View){
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
    fun onClickClose(view: View){
        finish()
    }*/

/*        bindingClass.magicButton.setOnClickListener{
            bindingClass.magicTextView.visibility = View.GONE
        }*/
/*        bindingClass.addButton.setOnClickListener{
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
        }*/
/*        bindingClass.buttonResult.setOnClickListener {
            val result = bindingClass.InputNumber.text.toString().toInt()
            when(result){
                in 0..1000 -> {
                    bindingClass.textResult.visibility = View.VISIBLE
                    bindingClass.textResult.text = "Begginer"
                }
                in 0..100000 ->{
                    bindingClass.textResult.visibility = View.VISIBLE
                    bindingClass.textResult.text = "Advanced"
                }
                    else -> {
                        bindingClass.textResult.visibility = View.VISIBLE
                        bindingClass.textResult.text = "Super Star"
                    }
            }
        }*/
    /*bindingClass.buttonGet.setOnClickListener {
        val resultInput = bindingClass.editInputName.text.toString()
        bindingClass.imageWorker.visibility = View.VISIBLE
        when(resultInput){
            "Ben" -> {bindingClass.textResult.visibility = View.VISIBLE
                val dirResult = "${Constance.DIRECTOR_NAME}, get your salary - ${Constance.DIRECTOR_SALARY}"
                if (bindingClass.editInputPin.text.toString() == Constance.DIRECTOR_PIN){
                    bindingClass.textResult.text = dirResult
                    bindingClass.imageWorker.setImageResource(R.drawable.face_ben)
                }
                else
                    bindingClass.imageWorker.setImageResource(R.drawable.face_error)
                    bindingClass.textResult.text = Constance.ERROR_PIN
            }
            "Lee" -> {bindingClass.textResult.visibility = View.VISIBLE
                val engResult = "${Constance.ENGEENER_NAME}, get your salary - ${Constance.ENGEENER_SALARY}"
                if (bindingClass.editInputPin.text.toString() == Constance.ENGEENER_PIN){
                    bindingClass.textResult.text = engResult
                    bindingClass.imageWorker.setImageResource(R.drawable.face_lee)
                }
                else
                    bindingClass.imageWorker.setImageResource(R.drawable.face_error)
                    bindingClass.textResult.text = Constance.ERROR_PIN
            }
            "Joe" -> {bindingClass.textResult.visibility = View.VISIBLE
                val mangResult = "${Constance.MANAGER_NAME}, get your salary - ${Constance.MANAGER_SALARY}"
                if (bindingClass.editInputPin.text.toString() == Constance.MANAGER_PIN){
                    bindingClass.textResult.text = mangResult
                    bindingClass.imageWorker.setImageResource(R.drawable.face_joe)
                }
                else
                    bindingClass.imageWorker.setImageResource(R.drawable.face_error)
                    bindingClass.textResult.text = Constance.ERROR_PIN
            }
            else -> {
                bindingClass.textResult.visibility = View.VISIBLE
                bindingClass.textResult.text = Constance.ERROR_WORKER
            }
        }

    }*/

}
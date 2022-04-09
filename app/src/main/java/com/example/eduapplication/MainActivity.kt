package com.example.eduapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.eduapplication.constance.Constance
import com.example.eduapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    private var login: String = "empty"
    private var password: String = "empty"
    private var name: String = "empty"
    private var secondName: String = "empty"
    private var middleName: String = "empty"
    private var avatarImgId: Int = 0
    override fun onCreate(myArg: Bundle?){
        super.onCreate(myArg)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == Constance.REQUEST_CODE_SIGN_IN){

        }else if (requestCode == Constance.REQUEST_CODE_SIGN_UP){

        }
    }
    fun onClickSingIn(view: View){
        val intent = Intent(this, SignActivity::class.java)
        intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_IN_STATE)
        startActivityForResult(intent, Constance.REQUEST_CODE_SIGN_IN)
    }
    fun onClickSingUp(view: View){
        val intent = Intent(this, SignActivity::class.java)
        intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_UP_STATE)
        startActivityForResult(intent, Constance.REQUEST_CODE_SIGN_UP)
    }
}
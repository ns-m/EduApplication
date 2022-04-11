package com.example.eduapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.example.eduapplication.constance.Constance
import com.example.eduapplication.databinding.ActivitySignBinding

class SignActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivitySignBinding
    private var signState = ""
    override fun onCreate(myArg: Bundle?){
        super.onCreate(myArg)
        bindingClass = ActivitySignBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        signState = intent.getStringExtra(Constance.SIGN_STATE)!!
        if (signState == Constance.SIGN_IN_STATE){
            bindingClass.buttonAvatar.visibility = View.INVISIBLE
            bindingClass.editTextName.visibility = View.GONE
            bindingClass.editTextSecName.visibility = View.GONE
            bindingClass.editTextMidName.visibility = View.GONE
        }
    }
    fun onClickDone(view: View){
        if (signState == Constance.SIGN_UP_STATE){
            val intent = Intent()
            if (bindingClass.avatarView.isVisible)intent.putExtra(Constance.AVATAR_ID, R.drawable.face_ben)
            intent.putExtra(Constance.LOGIN, bindingClass.editTextLogin.text.toString())
            intent.putExtra(Constance.PASSWORD, bindingClass.editTextPassword.text.toString())
            intent.putExtra(Constance.NAME, bindingClass.editTextName.text.toString())
            intent.putExtra(Constance.NAME_SECOND, bindingClass.editTextSecName.text.toString())
            intent.putExtra(Constance.NAME_MIDDLE, bindingClass.editTextMidName.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        } else if (signState == Constance.SIGN_IN_STATE){
            intent.putExtra(Constance.LOGIN, bindingClass.editTextLogin.text.toString())
            intent.putExtra(Constance.PASSWORD, bindingClass.editTextPassword.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        }
    }
    fun onClickAvatar(view: View){
        bindingClass.avatarView.visibility = View.VISIBLE
    }
}
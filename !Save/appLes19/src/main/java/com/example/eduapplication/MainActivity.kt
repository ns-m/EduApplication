package com.example.eduapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
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
            val logn = data?.getStringExtra(Constance.LOGIN)
            val pwd = data?.getStringExtra(Constance.PASSWORD)
            if (logn == logn && password == pwd){
                bindingClass.imgAvatar.visibility = View.VISIBLE
                bindingClass.imgAvatar.setImageResource(avatarImgId)
                val txtInfo = "$name $secondName $middleName"
                bindingClass.textInfo.text = txtInfo
                bindingClass.singUp.visibility = View.GONE
                bindingClass.singIn.text = Constance.BUTTON_EXIT
            }else {
                bindingClass.imgAvatar.visibility = View.VISIBLE
                bindingClass.imgAvatar.setImageResource(R.drawable.face_error)
                bindingClass.textInfo.text = Constance.ERROR_SIGN_IN
            }
        }else if (requestCode == Constance.REQUEST_CODE_SIGN_UP){
            login = data?.getStringExtra(Constance.LOGIN)!!
            password = data.getStringExtra(Constance.PASSWORD)!!
            name = data.getStringExtra(Constance.NAME)!!
            secondName = data.getStringExtra(Constance.NAME_SECOND)!!
            middleName = data.getStringExtra(Constance.NAME_MIDDLE)!!
            avatarImgId = data.getIntExtra(Constance.AVATAR_ID, 0)
            bindingClass.imgAvatar.visibility = View.VISIBLE
            bindingClass.imgAvatar.setImageResource(avatarImgId)
            val txtInfo = "$name $secondName $middleName"
            bindingClass.textInfo.text = txtInfo
            bindingClass.singUp.visibility = View.GONE
            bindingClass.singIn.text = Constance.BUTTON_EXIT
        }
    }
    fun onClickSingIn(view: View){
        if (bindingClass.imgAvatar.isVisible && bindingClass.textInfo.text != Constance.ERROR_SIGN_IN){
            bindingClass.imgAvatar.visibility = View.INVISIBLE
            bindingClass.textInfo.text = ""
            bindingClass.singUp.visibility = View.VISIBLE
            bindingClass.singIn.text = Constance.SIGN_IN_STATE
        }else {
            val intent = Intent(this, SignActivity::class.java)
            intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_IN_STATE)
            startActivityForResult(intent, Constance.REQUEST_CODE_SIGN_IN)
        }
    }
    fun onClickSingUp(view: View){
        val intent = Intent(this, SignActivity::class.java)
        intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_UP_STATE)
        startActivityForResult(intent, Constance.REQUEST_CODE_SIGN_UP)
    }
}
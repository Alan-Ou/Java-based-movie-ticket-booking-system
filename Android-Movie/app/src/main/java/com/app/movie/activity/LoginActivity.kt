package com.app.movie.activity

import android.content.Intent
import android.text.TextUtils
import com.app.movie.base.BaseActivity
import com.app.movie.databinding.ActivityLoginBinding
import com.app.movie.db.UserInfoDao

class LoginActivity : BaseActivity() {

    private lateinit var binding: ActivityLoginBinding

    private val userDao by lazy {
        UserInfoDao(this)
    }

    override fun setLayoutResId() {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun setListener() {

        binding.btnRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
        binding.btnLogin.setOnClickListener {
            val name = binding.etUserName.text.toString().trim()
            val pawd = binding.etUserPswd.text.toString().trim()
            if (TextUtils.isEmpty(name)) {
                BaseToast("Please enter the username")
            } else if (TextUtils.isEmpty(pawd)) {
                BaseToast("Please enter the password")
            } else {
                val userInfo = userDao.queryUserInfo(name)
                if (null != userInfo) {
                    val name = binding.etUserName.text.toString().trim()
                    val pawd = binding.etUserPswd.text.toString().trim()
                    if (userInfo.name.equals(name) && userInfo.pswd.equals(pawd)) {
                        startActivity(Intent(this, MainActivity::class.java))
                        finish()
                    } else {
                        BaseToast("Password or username is wrong")
                    }
                } else {
                    BaseToast("Please register")
                }
            }

        }
    }

    override fun initDatas() {

    }


}
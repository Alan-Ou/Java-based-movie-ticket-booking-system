package com.app.movie.activity

import android.content.Intent
import android.text.TextUtils
import com.app.movie.base.BaseActivity
import com.app.movie.databinding.ActivityLoginBinding
import com.app.movie.db.UserInfoDao
import com.app.movie.utils.SPUtils

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
                BaseToast("请输入用户名")
            } else if (TextUtils.isEmpty(pawd)) {
                BaseToast("请输入密码")
            } else {
                val userInfo = userDao.queryUserInfo(name)
                if (null != userInfo) {
                    val name = binding.etUserName.text.toString().trim()
                    val pawd = binding.etUserPswd.text.toString().trim()
                    if (userInfo.name.equals(name) && userInfo.pswd.equals(pawd)) {
                        SPUtils.saveObject(this@LoginActivity, "userInfo", userInfo)
                        startActivity(Intent(this, MainActivity::class.java))
                        BaseToast("登录成功")
                        finish()
                    } else {
                        BaseToast("用户名或密码错误")
                    }
                } else {
                    BaseToast("请先注册")
                }
            }

        }
    }

    override fun initDatas() {

    }


}
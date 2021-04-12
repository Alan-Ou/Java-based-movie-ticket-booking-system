package com.app.movie.activity

import android.text.TextUtils
import android.view.View
import com.app.movie.base.BaseActivity
import com.app.movie.databinding.ActivityRegisterBinding
import com.app.movie.db.UserInfoDao
import com.app.movie.db.UserInfoDb

class RegisterActivity : BaseActivity() {
    private lateinit var binding: ActivityRegisterBinding

    private val userDao by lazy {
        UserInfoDao(this)
    }


    override fun setLayoutResId() {
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun setListener() {

        binding.toolbar.setNavigationOnClickListener {
            finish()
        }
    }

    override fun initDatas() {
    }


    fun register(view: View) {
        val name = binding.etUserName.text.toString().trim()
        val pwsd = binding.etUserPswd.text.toString().trim()
        if (TextUtils.isEmpty(name)) {
            BaseToast("请输入用户名")
        } else if (TextUtils.isEmpty(pwsd)) {
            BaseToast("请输入密码")
        } else {
            val insert = userDao.addRegister(name, "游客", pwsd)
            if (insert != -1) {
                BaseToast("注册成功")
                finish()
            } else {
                BaseToast("注册失败")
            }
        }

    }
}
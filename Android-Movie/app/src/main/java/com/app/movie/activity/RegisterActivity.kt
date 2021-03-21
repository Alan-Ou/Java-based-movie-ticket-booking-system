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


    fun btn_register(view: View) {
        val name = binding.etUserName.text.toString().trim()
        val pwsd = binding.etUserPswd.text.toString().trim()
        if (TextUtils.isEmpty(name)) {
            BaseToast("Please enter username")
        } else if (TextUtils.isEmpty(pwsd)) {
            BaseToast("Please enter password")
        } else {
            val insert = userDao.addRegister(name, pwsd)
            if (insert != -1) {
                BaseToast("Registration success")
                finish()
            } else {
                BaseToast("Registration failed")
            }
        }

    }
}
package com.app.movie.activity

import android.content.Intent
import android.text.TextUtils
import android.view.View
import com.app.movie.base.BaseActivity
import com.app.movie.bean.UserInfoBean
import com.app.movie.databinding.ActivityUpdatePwdBinding
import com.app.movie.db.UserInfoDao
import com.app.movie.utils.SPUtils


class UpdatePwdActivity : BaseActivity() {
    private lateinit var binding: ActivityUpdatePwdBinding


    private val userInfoDao by lazy { UserInfoDao(this) }


    override fun setLayoutResId() {

        binding = ActivityUpdatePwdBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun setListener() {

        binding.toolbar.setNavigationOnClickListener { finish() }


    }

    override fun initDatas() {


    }

    fun updatePwd(view: View) {
        val userInfoBean = SPUtils.getObject(this, "userInfo", UserInfoBean::class.java)
        val old = binding.etOldPwd.text.toString().trim()
        val new = binding.etNewPwd.text.toString().trim()
        val confirm = binding.etConfirmPwd.text.toString().trim()
        if (TextUtils.isEmpty(old)) {
            BaseToast("请输入旧密码")
        } else if (TextUtils.isEmpty(new)) {
            BaseToast("请输入新密码")
        } else if (TextUtils.isEmpty(confirm)) {
            BaseToast("请输入确定密码")
        } else if (!new.equals(confirm)) {
            BaseToast("新密码和确定密码不匹配")
        } else if (!old.equals(userInfoBean.pswd)) {
            BaseToast("旧密码输入错误")
        } else {
            val update = userInfoDao.updatePwd(confirm, userInfoBean.name!!)
            if (update != -1) {
                SPUtils.clear(this)
                startActivity(Intent(this, LoginActivity::class.java))
                setResult(200,intent)
                finish()
                BaseToast("修改成功")
            }
        }
    }

}
package com.app.movie.activity

import android.content.Intent
import android.text.TextUtils
import android.view.View
import com.app.movie.base.BaseActivity
import com.app.movie.bean.UserInfoBean
import com.app.movie.databinding.ActivityUpdateNicknameBinding
import com.app.movie.db.UserInfoDao
import com.app.movie.utils.SPUtils

class UpdateNicknameActivity: BaseActivity() {
    private lateinit var binding: ActivityUpdateNicknameBinding


    private val userInfoDao by lazy { UserInfoDao(this) }


    override fun setLayoutResId() {

        binding = ActivityUpdateNicknameBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun setListener() {

        binding.toolbar.setNavigationOnClickListener { finish() }


    }

    override fun initDatas() {


    }

    fun updateNickname(view: View) {
        val userInfoBean = SPUtils.getObject(this, "userInfo", UserInfoBean::class.java)
        val newNickname = binding.etNewNickname.text.toString().trim()

        if (TextUtils.isEmpty(newNickname)) {
            BaseToast("请输入新昵称")
        } else {
            val name = userInfoBean.name
            val update = userInfoDao.updateNickname(newNickname, userInfoBean.name!!)
            if (update != -1) {
                SPUtils.clear(this)
                val userInfo = userInfoDao.queryUserInfo(name!!)
                SPUtils.saveObject(this@UpdateNicknameActivity, "userInfo", userInfo)
                startActivity(Intent(this, CenterActivity::class.java))
//                setResult(300,intent)
                finish()
                BaseToast("修改成功")
            }
        }
    }
}
package com.app.movie.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.view.View
import com.app.movie.base.BaseActivity
import com.app.movie.bean.UserInfoBean
import com.app.movie.databinding.ActivityCenterBinding
import com.app.movie.utils.SPUtils

class CenterActivity : BaseActivity() {
    private lateinit var binding: ActivityCenterBinding
    private var userInfo: UserInfoBean? = null
    override fun setLayoutResId() {
        binding = ActivityCenterBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun setListener() {
        binding.toolbar.setNavigationOnClickListener {
            finish()
        }
    }

    @SuppressLint("SetTextI18n")
    override fun initDatas() {
        userInfo = SPUtils.getObject(this, "userInfo", UserInfoBean::class.java)
//        binding.userName.text = userInfo?.name
        binding.userName.text = userInfo?.nickname
//        binding.name.text = "昵称：${userInfo?.nickname}"
    }

    fun exit(view: View) {
        SPUtils.clear(this)
        startActivity(Intent(this, LoginActivity::class.java))
        setResult(200, intent)
        finish()

    }

    fun order(view: View) {
        startActivity(Intent(this, OrderListActivity::class.java))
    }


    fun updatePwd(view: View) {
        startActivityForResult(Intent(this, UpdatePwdActivity::class.java), 200)
    }

    fun updateNickname(view: View) {
        startActivity(Intent(this, UpdateNicknameActivity::class.java))
        finish()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data != null && resultCode == 200) {
            setResult(200,intent)
            finish()
        }
    }

}
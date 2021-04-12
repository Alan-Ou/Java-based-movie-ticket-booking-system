package com.app.movie.base

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.app.movie.bean.UserInfoBean
import com.app.movie.utils.SPUtils

/**
 *    author : yi.huangxing
 *    date   : 2021/3/12/0012  18:25
 *    desc   :
 */
open abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setLayoutResId()
        setListener()
        initDatas()
    }


    abstract fun setLayoutResId()
    abstract fun setListener()
    abstract fun initDatas()

    protected open fun BaseToast(msg: String) {

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

    }

    protected fun isLogin(): Boolean {

        val userInfoBean = SPUtils.getObject(this, "userInfo", UserInfoBean::class.java);
        return userInfoBean != null

    }
}
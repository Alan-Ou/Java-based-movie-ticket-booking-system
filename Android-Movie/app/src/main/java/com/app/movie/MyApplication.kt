package com.app.movie

import android.app.Application
import android.content.Context

/**
 *    author : yi.huangxing
 *    date   : 2021/3/15/0015  11:06
 *    desc   :
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        context = this

        RxHttpManager.init(this)

    }

    companion object {
        lateinit var context: Context
    }

}
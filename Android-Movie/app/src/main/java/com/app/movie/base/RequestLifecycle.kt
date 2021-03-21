package com.app.movie.base

/**
 *    author : yi.huangxing
 *    date   : 2021/3/15/0015  9:44
 *    desc   :
 */
interface RequestLifecycle {

    fun startLoading()

    fun loadFinished()

    fun loadFailed(msg: String?)

}
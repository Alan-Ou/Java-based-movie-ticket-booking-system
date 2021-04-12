package com.app.movie.bean

import java.io.Serializable

/**
 *    author : yi.huangxing
 *    date   : 2021/3/14 12:50 PM
 *    desc   :
 */

data class UserInfoBean(
    var _id: Int = 0,
    var name: String? = null,
    var nickname: String? = null,
    var pswd: String? = null

) : Serializable

package com.app.movie.bean

import java.io.Serializable

/**
 *    author : yi.huangxing
 *    date   : 2021/3/16/0016  15:23
 *    desc   :
 */

data class BookingBean(
    var time: String,
    var type: String,
    var few_number: String,
    var price: String
) : Serializable
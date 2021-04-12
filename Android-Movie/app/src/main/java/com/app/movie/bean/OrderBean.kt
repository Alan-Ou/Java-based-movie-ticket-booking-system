package com.app.movie.bean

/**
 *    author : yi.huangxing
 *    date   : 2021/3/16/0016  20:27
 *    desc   :
 */
data class OrderBean(
    var movie_id: Int,
    var movie_name: String,
    var movie_img: String,
    var movie_number: String,
    var movie_data: String,
    var movie_time: String,
    var order_time: String,
    var sold: String

)
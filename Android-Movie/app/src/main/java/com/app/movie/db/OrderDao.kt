package com.app.movie.db

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import com.app.movie.bean.OrderBean
import com.app.movie.bean.UserInfoBean

/**
 *    author : yi.huangxing
 *    date   : 2021/3/14 10:50 AM
 *    desc   :
 */
class OrderDao(context: Context) {

    private var helper: OrderDb = OrderDb(context)

    /**
     * 注册
     */

    fun addOrder(
        movie_name: String,
        movie_img: String,
        movie_number: String,
        movie_data: String,
        movie_time: String,
        order_time: String,
        sold:String
    ): Int {

        val db = helper.writableDatabase
        val values = ContentValues()
        values.put("movie_name", movie_name)
        values.put("movie_img", movie_img)
        values.put("movie_number", movie_number)
        values.put("movie_data", movie_data)
        values.put("movie_time", movie_time)
        values.put("order_time", order_time)
        values.put("sold", sold)
        //填充占位符
        val nullColumnHack = "values(null,?,?,?,?,?,?,?)"
        //执行SQL
        val insert = db.insert("order_tab", nullColumnHack, values)
        db.close()
        return insert.toInt()
    }

    /**
     * 查询
     */

    @SuppressLint("Recycle")
    fun queryOrder(): MutableList<OrderBean> {
        val list = mutableListOf<OrderBean>()
        val db = helper.readableDatabase
        val sql =
            "select _id,movie_name,movie_img,movie_number,movie_data,movie_time,order_time,sold from order_tab order by _id desc"
        val cursor = db.rawQuery(sql, null)
        while (cursor.moveToNext()) {
            val _id = cursor.getInt(cursor.getColumnIndex("_id"))
            val name = cursor.getString(cursor.getColumnIndex("movie_name"))
            val img = cursor.getString(cursor.getColumnIndex("movie_img"))
            val number = cursor.getString(cursor.getColumnIndex("movie_number"))
            val data = cursor.getString(cursor.getColumnIndex("movie_data"))
            val time = cursor.getString(cursor.getColumnIndex("movie_time"))
            val ordertime = cursor.getString(cursor.getColumnIndex("order_time"))
            val sold = cursor.getString(cursor.getColumnIndex("sold"))
            list.add(OrderBean(_id, name, img, number, data, time,ordertime,sold))

        }
        db.close()
        return list
    }

}
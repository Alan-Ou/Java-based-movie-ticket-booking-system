package com.app.movie.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log

/**
 *    author : yi.huangxing
 *    date   : 2021/3/16/0016  20:24
 *    desc   :
 */
class OrderDb(context: Context) : SQLiteOpenHelper(context, "order_list.db", null, 1) {

    override fun onCreate(db: SQLiteDatabase?) {


        db?.execSQL(
            "create table order_tab(_id integer primary key," +
                    " movie_name text," +
                    " movie_img text," +
                    "movie_number text," +
                    "movie_data text," +
                    "movie_time text," +
                    "order_time text," +
                    "sold text" +
                    ")"
        )

        Log.d("-------", "onCreate:创建成功--------")

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }
}
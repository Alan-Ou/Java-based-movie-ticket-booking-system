package com.app.movie.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log

/**
 *    author : yi.huangxing
 *    date   : 2021/3/14 10:39 AM
 *    desc   :
 */
class UserInfoDb(context: Context) : SQLiteOpenHelper(context, "userInfo.db", null, 1) {


    override fun onCreate(db: SQLiteDatabase?) {


        db?.execSQL(
            "create table userInfo_tab(_id integer primary key," +
                    " name text," +
                    "nickname text," +
                    "password text)"
        )

        Log.d("-------", "onCreate:创建成功--------")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }
}
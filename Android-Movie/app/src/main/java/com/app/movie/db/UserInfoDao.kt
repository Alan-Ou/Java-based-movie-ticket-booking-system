package com.app.movie.db

import android.content.ContentValues
import android.content.Context
import com.app.movie.bean.UserInfoBean

/**
 *    author : yi.huangxing
 *    date   : 2021/3/14 10:50 AM
 *    desc   :
 */
class UserInfoDao(context: Context) {

    private var helper: UserInfoDb = UserInfoDb(context)

    /**
     * 注册
     */

    fun addRegister(name: String, password: String): Int {

        val db = helper.writableDatabase
        val values = ContentValues()
        values.put("name", name)
        values.put("password", password)
        //填充占位符
        val nullColumnHack = "values(null,?,?)"
        //执行SQL
        val insert = db.insert("userInfo_tab", nullColumnHack, values)
        db.close()
        return insert.toInt()
    }

    /**
     * 查询
     */

    fun queryUserInfo(name: String): UserInfoBean? {
        var bean: UserInfoBean? = null
        val db = helper.readableDatabase
        val sql = "select _id,name,password from userInfo_tab where name=? "
        val selectionArgs = arrayOf(name)
        var cursor = db.rawQuery(sql, selectionArgs)
        while (cursor.moveToNext()) {
            val _id = cursor.getInt(cursor.getColumnIndex("_id"))
            val name = cursor.getString(cursor.getColumnIndex("name"))
            val password = cursor.getString(cursor.getColumnIndex("password"))
            bean = UserInfoBean()
            bean._id = _id
            bean.name = name
            bean.pswd = password
        }
        return bean
    }

}
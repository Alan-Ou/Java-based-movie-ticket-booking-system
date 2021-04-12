package com.app.movie.utils

import android.annotation.SuppressLint
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

/**
 *    author : yi.huangxing
 *    date   : 2021/3/16/0016  17:52
 *    desc   :
 */

object DataUtils {


    /**
     * 获取当前日期
     */
    @SuppressLint("SimpleDateFormat")
    fun getCurrentData(): String {
        val forment = SimpleDateFormat("M月dd")
        val data = forment.format(Date())

        return data
    }

    fun getOrderData(): String {


        val forment = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        val data = forment.format(Date())

        return data
    }


    /**
     * 获取当前时间向后推一天的时间
     */
    @SuppressLint("SimpleDateFormat")
    fun getOldDate(distanceDay: Int): String {

        val dft = SimpleDateFormat("M月dd")
        val beginDate = Date()
        val date = Calendar.getInstance()
        date.time = beginDate
        date.set(Calendar.DATE, date.get(Calendar.DATE) + distanceDay)

        var endDate: Date? = null
        try {
            endDate = dft.parse(dft.format(date.time))

        } catch (e: Exception) {
            e.printStackTrace()
        }
        return dft.format(endDate)

    }
}
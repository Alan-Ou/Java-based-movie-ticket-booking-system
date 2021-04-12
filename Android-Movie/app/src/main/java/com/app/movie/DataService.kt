package com.app.movie

import com.app.movie.bean.BookingBean

/**
 *    author : yi.huangxing
 *    date   : 2021/3/16/0016  15:26
 *    desc   :  提供数据类
 */
object DataService {


    fun getBookingLists(): MutableList<BookingBean> {
        val lists = mutableListOf<BookingBean>()
        lists.add(BookingBean("08:45", "原版3D", "2号厅(激光按摩厅)", "￥58"))
        lists.add(BookingBean("09:35", "原版3D", "6号厅(激光按摩厅)", "￥68"))
        lists.add(BookingBean("10:05", "原版3D", "3号厅(激光按摩厅)", "￥38"))
        lists.add(BookingBean("13:25", "原版3D", "6号厅(激光按摩厅)", "￥78"))
        lists.add(BookingBean("16:45", "原版3D", "6号厅(激光按摩厅)", "￥88"))
        lists.add(BookingBean("19:55", "原版3D", "9号厅(激光按摩厅)", "￥48"))
        lists.add(BookingBean("20:45", "原版3D", "5号厅(激光按摩厅)", "￥28"))
        lists.add(BookingBean("21:00", "原版3D", "6号厅(激光按摩厅)", "￥78"))
        lists.add(BookingBean("22:15", "原版3D", "8号厅(激光按摩厅)", "￥90"))
        lists.add(BookingBean("10:25", "原版3D", "7号厅(激光按摩厅)", "￥108"))
        return lists
    }


    fun getBookingLists1(): MutableList<BookingBean> {
        val lists = mutableListOf<BookingBean>()
        lists.add(BookingBean("09:35", "原版3D", "6号厅(激光按摩厅)", "￥68"))
        lists.add(BookingBean("10:05", "原版3D", "3号厅(激光按摩厅)", "￥38"))
        lists.add(BookingBean("13:25", "原版3D", "6号厅(激光按摩厅)", "￥78"))
        lists.add(BookingBean("16:45", "原版3D", "6号厅(激光按摩厅)", "￥88"))
        lists.add(BookingBean("21:00", "原版3D", "6号厅(激光按摩厅)", "￥78"))
        lists.add(BookingBean("22:15", "原版3D", "8号厅(激光按摩厅)", "￥90"))
        lists.add(BookingBean("10:25", "原版3D", "7号厅(激光按摩厅)", "￥108"))
        return lists
    }

    fun getBookingLists2(): MutableList<BookingBean> {
        val lists = mutableListOf<BookingBean>()
        lists.add(BookingBean("13:25", "原版3D", "6号厅(激光按摩厅)", "￥78"))
        lists.add(BookingBean("16:45", "原版3D", "6号厅(激光按摩厅)", "￥88"))
        lists.add(BookingBean("20:45", "原版3D", "5号厅(激光按摩厅)", "￥28"))
        lists.add(BookingBean("21:00", "原版3D", "6号厅(激光按摩厅)", "￥78"))
        lists.add(BookingBean("10:25", "原版3D", "7号厅(激光按摩厅)", "￥108"))
        return lists
    }


}
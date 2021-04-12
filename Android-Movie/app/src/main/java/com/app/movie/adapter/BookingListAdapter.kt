package com.app.movie.adapter

import com.app.movie.R
import com.app.movie.bean.BookingBean
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder

/**
 * author : yi.huangxing
 * date   : 2021/3/16/0016  15:22
 * desc   :
 */
class BookingListAdapter :BaseQuickAdapter<BookingBean,BaseViewHolder>(R.layout.booking_item){

    override fun convert(holder: BaseViewHolder, item: BookingBean) {
       holder.setText(R.id.price,item.price)
       holder.setText(R.id.time,item.time)
       holder.setText(R.id.type,item.type)
       holder.setText(R.id.few_number,item.few_number)
    }

}
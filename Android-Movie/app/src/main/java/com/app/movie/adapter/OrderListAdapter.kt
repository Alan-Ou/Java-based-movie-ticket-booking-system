package com.app.movie.adapter

import androidx.appcompat.widget.AppCompatImageView
import com.app.movie.R
import com.app.movie.bean.OrderBean
import com.app.movie.databinding.HotItemLayoutBinding
import com.app.movie.utils.GlideImageLoader
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import kotlin.concurrent.timer

/**
 *    author : yi.huangxing
 *    date   : 2021/3/16/0016  20:39
 *    desc   :
 */
class OrderListAdapter : BaseQuickAdapter<OrderBean, BaseViewHolder>(R.layout.order_item_layout) {
    private var movie_img: AppCompatImageView? = null

    override fun convert(holder: BaseViewHolder, item: OrderBean) {
        movie_img = holder.getView(R.id.movie_img)
        holder.setText(R.id.movie_name, item.movie_name)
        holder.setText(
            R.id.movie_date,
            item.movie_data.substring(item.movie_data.indexOf(" "), item.movie_data.length)
        )
        holder.setText(R.id.movie_time, item.movie_time)
        holder.setText(R.id.order_time,"下单时间：${item.order_time}")
        holder.setText(R.id.movie_sold, "【${item.sold}】")


        val url = item.movie_img
        val subUrl = url.substring(url.indexOf(".h") + 2, url.length)
        GlideImageLoader.displayImage("https://p0.meituan.net/${subUrl}",movie_img!!)

    }
}
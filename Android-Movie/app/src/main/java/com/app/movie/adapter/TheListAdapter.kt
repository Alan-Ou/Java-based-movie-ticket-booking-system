package com.app.movie.adapter

import android.view.View
import android.widget.RatingBar
import androidx.appcompat.widget.AppCompatImageView
import com.app.movie.utils.GlideImageLoader
import com.app.movie.R
import com.app.movie.bean.Coming
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder

/**
 *    author : yi.huangxing
 *    date   : 2021/3/15/0015  14:35
 *    desc   :
 */
class TheListAdapter : BaseQuickAdapter<Coming, BaseViewHolder>(R.layout.the_item_layout) {
    private var mRatingBar: RatingBar? = null
    private var icon: AppCompatImageView? = null


    override fun convert(holder: BaseViewHolder, item: Coming) {
        val url = item.img
        val subUrl = url.substring(url.indexOf(".h") + 2, url.length)
        icon = holder.getView(R.id.icon)
        mRatingBar = holder.getView(R.id.rb_rating)
        GlideImageLoader.displayImage("https://p0.meituan.net/${subUrl}", icon!!)

        //
        holder.setText(R.id.movie_name, item.nm)
        holder.setText(R.id.tv_rating, item.sc.toString())
        holder.setText(R.id.movie_time, item.rt + "中国大陆重演")
        holder.setText(R.id.tv_movie_actor, "主演：${item.star}")

        if (item.sc > 0) {
            mRatingBar?.visibility = View.VISIBLE
            mRatingBar?.rating = (item.sc / 2).toFloat()
        } else {
            mRatingBar?.visibility = View.GONE
            holder.setText(R.id.tv_rating, "暂无评分")
        }

    }

}
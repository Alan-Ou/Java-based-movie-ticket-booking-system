package com.app.movie.adapter

import android.util.Log
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import com.app.movie.GlideImageLoader
import com.app.movie.MyApplication
import com.app.movie.R
import com.app.movie.bean.Movie
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder

/**
 *    author : yi.huangxing
 *    date   : 2021/3/15/0015  13:05
 *    desc   :
 */
class HotListAdapter : BaseQuickAdapter<Movie, BaseViewHolder>(R.layout.hot_item_layout) {
    private var icon: AppCompatImageView? = null
    private var mRatingBar: RatingBar? = null


    override fun convert(holder: BaseViewHolder, item: Movie) {
        val url = item.img
        val subUrl = url.substring(url.indexOf(".h") + 2, url.length)
        icon = holder.getView(R.id.icon)
        mRatingBar = holder.getView(R.id.rb_rating)
        GlideImageLoader.displayImage("https://p0.meituan.net/${subUrl}", icon!!)
        //
        holder.setText(R.id.movie_name, item.nm)
        holder.setText(R.id.tv_rating, item.sc.toString())
        holder.setText(R.id.movie_time, item.rt + "Repeat") //中国大陆重演
        holder.setText(R.id.tv_movie_actor, "Stars：${item.star}") //主演

        if (item.sc > 0) {
            mRatingBar?.rating = (item.sc / 2).toFloat()
        } else {
            holder.setText(R.id.tv_rating, "No scores") //暂无评分
        }

    }
}
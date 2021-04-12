package com.app.movie.utils

import androidx.appcompat.widget.AppCompatImageView
import com.app.movie.MyApplication
import com.app.movie.R
import com.bumptech.glide.Glide

/**
 *    author : yi.huangxing
 *    date   : 2021/3/15/0015  13:38
 *    desc   :
 */
object GlideImageLoader {


    fun displayImage(path: String, imageView: AppCompatImageView) {
        //具体方法内容自己去选择，次方法是为了减少banner过多的依赖第三方包，所以将这个权限开放给使用者去选择
        Glide.with(MyApplication.context)
            .load(path)
            .placeholder(R.mipmap.placeholder)
            .into(imageView)
    }
}
package com.app.movie.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.view.View
import com.app.movie.utils.GlideImageLoader
import com.app.movie.base.BaseActivity
import com.app.movie.bean.MovieDetailBean
import com.app.movie.bean.UserInfoBean
import com.app.movie.databinding.ActivityMovieDetailBinding
import com.google.gson.Gson
import com.rxjava.rxlife.RxLife
import rxhttp.wrapper.param.RxHttp
import com.app.movie.utils.SPUtils


class MovieDetailActivity : BaseActivity() {
    private lateinit var binding: ActivityMovieDetailBinding
    private var movieId: Int = 0

    private var movieDetailBean: MovieDetailBean? = null

    companion object {
        const val url = "https://m.maoyan.com/ajax/detailmovie"
    }


    override fun setLayoutResId() {


        binding = ActivityMovieDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun setListener() {
        binding.toolbar.setNavigationOnClickListener {
            finish()
        }
    }

    @SuppressLint("SetTextI18n")
    override fun initDatas() {
        movieId = intent.getIntExtra("id", 0)

        RxHttp.get(url).add("movieId", movieId)
            .addHeader(
                "Cookie",
                "from=; from=; uuid_n_v=v1; iuuid=D3CB9CA0860F11EBBF9F81492E2902A6F5879D1B0EEE48F2A72EA9925E74C610; webp=; ci=; ci=10%2C%E4%B8%8A%E6%B5%B7"
            )
            .asString()
            .to(RxLife.toMain(this))
            .subscribe({
                movieDetailBean = Gson().fromJson(it, MovieDetailBean::class.java)

                movieDetailBean?.detailMovie?.apply {
                    binding.movieName.text = nm
                    binding.enm.text = enm
                    binding.cat.text = cat
                    binding.src.text = src + "/${dur}分钟"
                    binding.pubDesc.text = pubDesc
                    binding.dra.text = dra

                    //头像
                    val subUrl = img.substring(img.indexOf(".h") + 2, img.length)
                    GlideImageLoader.displayImage("https://p0.meituan.net/${subUrl}", binding.img)
                }

            }, {

            })
    }


    /**
     * 购票
     */
    fun booking(view: View) {
        if (SPUtils.getObject(this, "userInfo", UserInfoBean::class.java) != null) {
            val intent = Intent(this, BookingActivity::class.java)
            intent.putExtra("movie", movieDetailBean?.detailMovie)
            startActivity(intent)
        } else {
            startActivity(Intent(this, LoginActivity::class.java))
        }

    }


}
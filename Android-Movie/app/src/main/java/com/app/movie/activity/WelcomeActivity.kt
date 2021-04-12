package com.app.movie.activity

import android.content.Intent
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.ViewPropertyAnimatorListener
import com.app.movie.base.BaseActivity
import com.app.movie.databinding.ActivityWelcomeBinding

class WelcomeActivity : BaseActivity() {
    private lateinit var binding: ActivityWelcomeBinding

    override fun setLayoutResId() {
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun setListener() {
    }

    override fun initDatas() {
        ViewCompat.animate(binding.tvWelcome).scaleX(1.0f).scaleY(1.0f)
            .setListener(object : ViewPropertyAnimatorListener {
                override fun onAnimationEnd(view: View?) {

                    Handler(Looper.getMainLooper()).postDelayed(Runnable {

//                        if (isLogin()) {
//                            startActivity(Intent(this@WelcomeActivity, MainActivity::class.java))
//                        } else {
//                            startActivity(Intent(this@WelcomeActivity, LoginActivity::class.java))
//                        }
                        startActivity(Intent(this@WelcomeActivity, MainActivity::class.java))
                        finish()

                    }, 1000)
                }

                override fun onAnimationCancel(view: View?) {
                }

                override fun onAnimationStart(view: View?) {
                }

            }).duration = 800
    }

}
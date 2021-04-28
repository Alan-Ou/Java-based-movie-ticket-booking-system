package com.app.movie.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.CountDownTimer
import android.text.Html
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.TextView
import com.app.movie.R
import com.app.movie.base.BaseActivity
import com.app.movie.bean.BookingBean
import com.app.movie.bean.DetailMovie
import com.app.movie.bean.MovieDetailBean
import com.app.movie.databinding.ActivityConfirmBookingBinding
import com.app.movie.db.OrderDao
import com.app.movie.utils.DataUtils
import com.app.movie.view.SeatTable

class ConfirmBookingActivity : BaseActivity() {
    companion object {
        const val TAG = "-----------------------"
    }

    private val orderDao by lazy { OrderDao(this) }
    private lateinit var binding: ActivityConfirmBookingBinding

    private var info: BookingBean? = null
    private var movie: DetailMovie? = null
    private var currentData: String? = null

    private var isSoldStr: String? = null


    override fun setLayoutResId() {

        binding = ActivityConfirmBookingBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun setListener() {

        binding.toolbar.setNavigationOnClickListener {
            finish()
        }
    }

    @SuppressLint("SetTextI18n")
    override fun initDatas() {

        info = intent.getSerializableExtra("info") as BookingBean
        movie = intent.getSerializableExtra("movie") as DetailMovie
        currentData = intent.getStringExtra("current")

        binding.content.text =
            currentData + "  ${info?.time}" + "   ${info?.few_number}" + "   ${info?.type}"
        binding.movieName.text = movie?.nm

        //设置屏幕名称
        binding.seatView.setScreenName(info?.few_number)
        binding.seatView.setMaxSelected(1) //设置最多选中
        binding.seatView.setSeatChecker(object : SeatTable.SeatChecker {
            override fun checked(row: Int, column: Int) {
                Log.d(TAG, "checked: ${row}--------${column}")

                isSoldStr = (row + 1).toString() + "排-" + (column + 1) + "座"

                binding.bntConfirm.text = "${info?.price} 确定选座"
            }

            override fun isSold(row: Int, column: Int): Boolean {
                if (row == 6 && column == 6) {
                    return true
                }
                return false
            }

            override fun unCheck(row: Int, column: Int) {
                Log.d(TAG, "unCheck: ${row}--------${column}")
                isSoldStr = null
                binding.bntConfirm.text = "请先选座"
            }

            override fun checkedSeatTxt(row: Int, column: Int): Array<String>? {

                return null
            }

            override fun isValidSeat(row: Int, column: Int): Boolean {
                if (column == 2) {
                    return false
                }
                return true
            }
        })

        binding.seatView.setData(10, 15)

        var t: Long = 30 * 1000 // 定义选座最长时长30s
        var countDownTimer = object : CountDownTimer(t, 1000) {
            override fun onFinish() {
                BaseToast("未在30s内完成选座，请重新选座！")
                finish()
            }

            override fun onTick(millisUntilFinished: Long) {
                var second = millisUntilFinished / 1000
                val strMsg = "等待选座，剩余<font color=\"#FF8C00\">${ second }</font>秒"
                val textView = findViewById<TextView>(R.id.call_time)
                textView.text = Html.fromHtml(strMsg)
            }
        }.start()

    }

    fun goPay(view: View) {
        if (TextUtils.isEmpty(isSoldStr)) {
            BaseToast("请先选座")
        } else {
            val insert = orderDao.addOrder(
                movie!!.nm,
                movie!!.img,
                1.toString(),
                currentData.toString(),
                info!!.time,
                DataUtils.getOrderData(),
                isSoldStr.toString()
            )
            if (insert != -1) {
                startActivity(Intent(this, OrderListActivity::class.java))
                BaseToast("订票成功")
                finish()

            } else {
                BaseToast("购票失败")
            }
        }
    }
}
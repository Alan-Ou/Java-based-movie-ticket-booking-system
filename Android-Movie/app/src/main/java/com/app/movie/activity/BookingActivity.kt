package com.app.movie.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.core.content.ContextCompat
import com.app.movie.DataService
import com.app.movie.utils.DataUtils
import com.app.movie.R
import com.app.movie.adapter.BookingListAdapter
import com.app.movie.base.BaseActivity
import com.app.movie.bean.DetailMovie
import com.app.movie.databinding.ActivityBookingBinding
import com.app.movie.extension.setOnClickListener

class BookingActivity : BaseActivity() {

    private lateinit var binding: ActivityBookingBinding
    private val bookingListAdapter by lazy {
        BookingListAdapter()
    }

    private var currentData: String? = null
    private var movie: DetailMovie? = null

    override fun setLayoutResId() {
        binding = ActivityBookingBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun setListener() {
        binding.toolbar.setNavigationOnClickListener {
            finish()
        }

        setOnClickListener(binding.today, binding.tomorrow, binding.afterTomorrow) {
            when (this) {
                binding.today -> {
                    setSelector(0)
                    bookingListAdapter.setNewInstance(DataService.getBookingLists())
                }
                binding.tomorrow -> {
                    setSelector(1)
                    bookingListAdapter.setNewInstance(DataService.getBookingLists1())
                }
                binding.afterTomorrow -> {
                    setSelector(2)
                    bookingListAdapter.setNewInstance(DataService.getBookingLists2())
                }
            }
        }

        bookingListAdapter.setOnItemClickListener { adapter, view, position ->
            val intent = Intent(this, ConfirmBookingActivity::class.java)
            val bookingBean = bookingListAdapter.data[position]
            intent.putExtra("info", bookingBean)
            intent.putExtra("movie",movie)
            intent.putExtra("current", currentData)
            startActivity(intent)
        }
    }

    @SuppressLint("SetTextI18n")
    override fun initDatas() {
        setSelector(0)

        movie = intent.getSerializableExtra("movie") as DetailMovie

        currentData = "今天  " + DataUtils.getCurrentData()
        binding.today.text = "今天${DataUtils.getCurrentData()}"
        binding.tomorrow.text = "明天${DataUtils.getOldDate(1)}"
        binding.afterTomorrow.text = "后天${DataUtils.getOldDate(2)}"

        bookingListAdapter.setNewInstance(DataService.getBookingLists())
        binding.recyclerview.adapter = bookingListAdapter
    }


    fun setSelector(posttion: Int) {
        hidden()
        when (posttion) {
            0 -> {
                binding.today.setTextColor(Color.parseColor("#FF5D28"))
                binding.today.setBackgroundResource(R.drawable.text_bg_selector)
                currentData = "今天  " + DataUtils.getCurrentData()
            }
            1 -> {

                binding.tomorrow.setTextColor(Color.parseColor("#FF5D28"))
                binding.tomorrow.setBackgroundResource(R.drawable.text_bg_selector)
                currentData = "明天  " + DataUtils.getOldDate(1)
            }
            2 -> {
                binding.afterTomorrow.setTextColor(Color.parseColor("#FF5D28"))
                binding.afterTomorrow.setBackgroundResource(R.drawable.text_bg_selector)
                currentData = "后天  " + DataUtils.getOldDate(2)

            }
        }

    }


    fun hidden() {

        binding.today.setBackgroundResource(R.drawable.text_bg_normal)
        binding.tomorrow.setBackgroundResource(R.drawable.text_bg_normal)
        binding.afterTomorrow.setBackgroundResource(R.drawable.text_bg_normal)
        binding.today.setTextColor(ContextCompat.getColor(this, R.color.textColor))
        binding.tomorrow.setTextColor(ContextCompat.getColor(this, R.color.textColor))
        binding.afterTomorrow.setTextColor(ContextCompat.getColor(this, R.color.textColor))


    }
}
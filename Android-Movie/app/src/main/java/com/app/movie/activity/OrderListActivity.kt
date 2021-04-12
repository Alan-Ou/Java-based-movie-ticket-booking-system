package com.app.movie.activity

import com.app.movie.adapter.OrderListAdapter
import com.app.movie.base.BaseActivity
import com.app.movie.databinding.ActivityOrderMainBinding
import com.app.movie.db.OrderDao


class OrderListActivity : BaseActivity() {

    private val orderDao by lazy { OrderDao(this) }
    private val orderListAdapter by lazy { OrderListAdapter() }

    private lateinit var binding: ActivityOrderMainBinding
    override fun setLayoutResId() {
        binding = ActivityOrderMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun setListener() {

        binding.toolbar.setNavigationOnClickListener {
            finish()
        }

        binding.recyclerview.adapter = orderListAdapter

    }

    override fun initDatas() {
        orderListAdapter.setNewInstance(orderDao.queryOrder())

    }

}
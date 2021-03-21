package com.app.movie.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import com.app.movie.adapter.HotListAdapter
import com.app.movie.base.BaseFragment
import com.app.movie.bean.HotResBean
import com.app.movie.databinding.FragmentOneBinding
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.listener.OnItemClickListener
import com.google.gson.Gson
import com.rxjava.rxlife.RxLife
import rxhttp.wrapper.param.RxHttp

/**
 * 正在热映
 */
class HotFragment : BaseFragment() {
    private var _binding: FragmentOneBinding? = null
    private val mHotListAdapter by lazy {
        HotListAdapter()
    }

    companion object {
        const val url = "https://m.maoyan.com/ajax/movieOnInfoList"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOneBinding.inflate(inflater, container, false)


        return _binding?.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        _binding?.recyclerview?.adapter = mHotListAdapter



        mHotListAdapter.setOnItemClickListener(object : OnItemClickListener {
            override fun onItemClick(adapter: BaseQuickAdapter<*, *>, view: View, position: Int) {

                BaseToast("Functions are under development..........")
            }

        })
    }


    override fun loadDataOnce() {
        super.loadDataOnce()

        RxHttp.get(url).asString().to(RxLife.toMain(this))
            .subscribe({
                val hotResBean = Gson().fromJson(it, HotResBean::class.java)
                mHotListAdapter.setNewInstance(hotResBean.movieList)
            }, {

            })
    }


}
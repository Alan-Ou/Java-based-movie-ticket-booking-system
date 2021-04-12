package com.app.movie.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import com.app.movie.activity.MovieDetailActivity
import com.app.movie.adapter.HotListAdapter
import com.app.movie.base.BaseFragment
import com.app.movie.bean.HotResBean
import com.app.movie.databinding.FragmentHotBinding
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.listener.OnItemClickListener
import com.google.gson.Gson
import com.rxjava.rxlife.RxLife
import rxhttp.wrapper.param.RxHttp

/**
 * 正在热映
 */
class HotFragment : BaseFragment() {
    private var _binding: FragmentHotBinding? = null
    private var hotResBean: HotResBean? = null


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
        _binding = FragmentHotBinding.inflate(inflater, container, false)


        return super.onCreateView(_binding!!.root)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        _binding?.recyclerview?.adapter = mHotListAdapter
        mHotListAdapter.setOnItemClickListener(object : OnItemClickListener {
            override fun onItemClick(adapter: BaseQuickAdapter<*, *>, view: View, position: Int) {
                val movie = hotResBean?.movieList?.get(position)
                val intent = Intent(getActivity(), MovieDetailActivity::class.java)
                intent.putExtra("id", movie?.id)
                startActivity(intent)

            }

        })
    }


    override fun loadDataOnce() {
        super.loadDataOnce()
        RxHttp.get(url).asString().to(RxLife.toMain(this))
            .subscribe({
                hotResBean = Gson().fromJson(it, HotResBean::class.java)
                mHotListAdapter.setNewInstance(hotResBean?.movieList)
                loadFinished()
            }, {
                loadFinished()
            })

    }
}
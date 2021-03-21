package com.app.movie.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.movie.adapter.TheListAdapter
import com.app.movie.base.BaseFragment
import com.app.movie.bean.TheResBean
import com.app.movie.databinding.FragmentTwoBinding
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.listener.OnItemClickListener
import com.google.gson.Gson
import com.rxjava.rxlife.RxLife
import rxhttp.wrapper.param.RxHttp

/**
 * 即将上映
 */
class TheFragment : BaseFragment() {
    private var _binding: FragmentTwoBinding? = null
    private val theListAdapter by lazy {
        TheListAdapter()
    }

    companion object {
        const val url = "https://m.maoyan.com/ajax/comingList?ci=10&token=&limit=8"
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTwoBinding.inflate(inflater, container, false)
        return _binding?.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        _binding?.recyclerview?.adapter = theListAdapter


        theListAdapter.setOnItemClickListener(object : OnItemClickListener {
            override fun onItemClick(adapter: BaseQuickAdapter<*, *>, view: View, position: Int) {

                BaseToast("Functions are under development..........")
            }

        })
    }


    override fun loadDataOnce() {
        super.loadDataOnce()
        Log.e(TAG, "loadDataOnce: 222222222222222222222")

        RxHttp.get(url).asString().to(RxLife.toMain(this))


            .subscribe({
                val bean = Gson().fromJson(it, TheResBean::class.java);
                theListAdapter.setNewInstance(bean.coming)

            }, {
                BaseToast(it.toString())
            })

    }

}
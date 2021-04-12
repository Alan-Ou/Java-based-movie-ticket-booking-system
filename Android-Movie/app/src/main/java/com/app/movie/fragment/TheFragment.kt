package com.app.movie.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.movie.activity.MovieDetailActivity
import com.app.movie.adapter.TheListAdapter
import com.app.movie.base.BaseFragment
import com.app.movie.bean.TheResBean
import com.app.movie.databinding.FragmentTheBinding
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.listener.OnItemClickListener
import com.google.gson.Gson
import com.rxjava.rxlife.RxLife
import rxhttp.wrapper.param.RxHttp

/**
 * 即将上映
 */
class TheFragment : BaseFragment() {
    private var theResBean: TheResBean? = null
    private var _binding: FragmentTheBinding? = null
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
        _binding = FragmentTheBinding.inflate(inflater, container, false)
        return super.onCreateView(_binding!!.root)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        _binding?.recyclerview?.adapter = theListAdapter

        theListAdapter.setOnItemClickListener(object : OnItemClickListener {
            override fun onItemClick(adapter: BaseQuickAdapter<*, *>, view: View, position: Int) {
                val info = theResBean?.coming?.get(position)
                val intent = Intent(getActivity(), MovieDetailActivity::class.java)
                intent.putExtra("id", info?.id)
                startActivity(intent)

            }

        })
    }


    override fun loadDataOnce() {
        super.loadDataOnce()
        RxHttp.get(url)
            .addHeader(
                "Cookie",
                "from=; from=; uuid_n_v=v1; iuuid=D3CB9CA0860F11EBBF9F81492E2902A6F5879D1B0EEE48F2A72EA9925E74C610; webp=; ci=; ci=10%2C%E4%B8%8A%E6%B5%B7"
            )
            .asString().to(RxLife.toMain(this))
            .subscribe({
                theResBean = Gson().fromJson(it, TheResBean::class.java);
                theListAdapter.setNewInstance(theResBean?.coming)
                loadFinished()
            }, {
                loadFinished()
                BaseToast(it.toString())
            })

    }

}
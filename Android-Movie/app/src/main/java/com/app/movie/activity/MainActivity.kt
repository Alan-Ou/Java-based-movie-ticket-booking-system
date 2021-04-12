package com.app.movie.activity

import android.content.Intent
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.app.movie.base.BaseActivity
import com.app.movie.bean.UserInfoBean
import com.app.movie.databinding.ActivityMainBinding
import com.app.movie.fragment.HotFragment
import com.app.movie.fragment.TheFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.app.movie.utils.SPUtils

class MainActivity : BaseActivity() {
    private val titles = arrayOf("正在热映", "即将上映")
    private val fragmentList: MutableList<Fragment> = ArrayList()

    private lateinit var binding: ActivityMainBinding


    override fun setLayoutResId() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    override fun setListener() {

    }

    override fun initDatas() {
        fragmentList.add(HotFragment())
        fragmentList.add(TheFragment())

        binding.viewpager.adapter = object : FragmentStateAdapter(this) {

            override fun getItemCount(): Int {
                return fragmentList.size
            }

            override fun createFragment(position: Int): Fragment {
                return fragmentList[position]
            }

        }
        binding.viewpager.offscreenPageLimit = 2
        val tabLayoutMediator = TabLayoutMediator(
            binding.tablayout,
            binding.viewpager,
            TabLayoutMediator.TabConfigurationStrategy { tab: TabLayout.Tab, position: Int ->
                tab.text = titles[position]
            })
        tabLayoutMediator.attach()

    }

    fun goCenter(view: View) {
        if (SPUtils.getObject(this, "userInfo", UserInfoBean::class.java) != null) {
            startActivityForResult(Intent(this, CenterActivity::class.java), 200)
        } else {
            startActivity(Intent(this, LoginActivity::class.java))
        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        Log.e("----------------", "onActivityResult:resultCode-1111-->${resultCode}")
        super.onActivityResult(requestCode, resultCode, data)
        if (data != null && resultCode == 200) {
            Log.e("----------------", "onActivityResult:resultCode-2222-->${resultCode}")
            finish()
        }
    }
}
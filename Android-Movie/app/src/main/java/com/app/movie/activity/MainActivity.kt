package com.app.movie.activity

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.app.movie.base.BaseActivity
import com.app.movie.databinding.ActivityMainBinding
import com.app.movie.fragment.HotFragment
import com.app.movie.fragment.TheFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : BaseActivity() {
    private val titles = arrayOf("Is showing", "Coming soon")
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
}
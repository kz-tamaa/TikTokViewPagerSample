package com.example.kt.timelinepager.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.kt.timelinepager.fragment.PlayerFragment
import com.example.kt.timelinepager.fragment.TimelineViewpager

class VerticalAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(p0: Int): Fragment? {
        return when(p0) {
            0 -> {
                TimelineViewpager()
            }
            1 -> {
                PlayerFragment()
            }
            else -> null
        }
    }
}
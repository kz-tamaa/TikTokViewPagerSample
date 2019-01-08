package com.example.kt.timelinepager.adapter

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.kt.timelinepager.fragment.TimelineFragment

class TimelinepagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    private val timelinePagerFragmentList = mutableListOf<Fragment>()

    fun addFragment(data: String) {
        val bundle = Bundle()
        bundle.putString("DATA", data)

        val timelineFragment = TimelineFragment()
        timelineFragment.arguments = bundle

        timelinePagerFragmentList.add(timelineFragment)
    }

    override fun getCount(): Int = timelinePagerFragmentList.size

    override fun getItem(p0: Int): Fragment {
        return timelinePagerFragmentList[p0]
    }
}
package com.example.kt.timelinepager.fragment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.kt.timelinepager.R
import com.example.kt.timelinepager.adapter.TimelinepagerAdapter
import kotlinx.android.synthetic.main.fragment_timeline_viewpager.view.*

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [timelineViewpager.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [timelineViewpager.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class TimelineViewpager : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val layout = inflater.inflate(R.layout.fragment_timeline_viewpager, container, false)
        val timelinePagerAdapter = TimelinepagerAdapter(childFragmentManager)
        timelinePagerAdapter.addFragment("1")
        timelinePagerAdapter.addFragment("2")
        timelinePagerAdapter.addFragment("3")
        timelinePagerAdapter.addFragment("4")
        timelinePagerAdapter.addFragment("5")

        layout.timelineViewPager.adapter = timelinePagerAdapter

        return layout
    }
}

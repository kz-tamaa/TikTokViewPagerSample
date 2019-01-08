package com.example.kt.timelinepager.fragment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.kt.timelinepager.R
import kotlinx.android.synthetic.main.fragment_timeline.view.*

class TimelineFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val layout = inflater.inflate(R.layout.fragment_timeline, container, false)
        val data = arguments?.getString("DATA") ?: "データなし"
        layout.numberTextView.text = data
        return layout
    }
}

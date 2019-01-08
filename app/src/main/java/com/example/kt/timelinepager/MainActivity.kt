package com.example.kt.timelinepager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kt.timelinepager.adapter.VerticalAdapter
import kotlinx.android.synthetic.main.activity_main.*
import me.kaelaela.verticalviewpager.transforms.DefaultTransformer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        verticalViewpager.adapter = VerticalAdapter(supportFragmentManager)
        verticalViewpager.setPageTransformer(false, DefaultTransformer())
    }
}

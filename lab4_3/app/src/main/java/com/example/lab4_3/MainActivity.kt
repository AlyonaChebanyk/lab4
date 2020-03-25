package com.example.lab4_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set adapter to the view pager
        viewPager.adapter = ViewPagerAdapter(this)

        //setting tab layout
        TabLayoutMediator(viewPagerTabLayout, viewPager) { tab, position ->
            tab.text = "Page ${position + 1}"
        }.attach()
    }
}

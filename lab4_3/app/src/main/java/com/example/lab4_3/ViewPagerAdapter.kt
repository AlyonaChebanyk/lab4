package com.example.lab4_3

import android.graphics.Color
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(activity: MainActivity): FragmentStateAdapter(activity) {

    private val colors = arrayListOf(
        Color.parseColor("#37BDB4"),
        Color.parseColor("#EA5366"),
        Color.parseColor("#F5B61B")
    )

    override fun createFragment(position: Int): Fragment = PagerFragment().apply {
        arguments = bundleOf(
            "color" to colors[position],
            "position" to position+1
        )
    }

    override fun getItemCount(): Int = colors.size
}
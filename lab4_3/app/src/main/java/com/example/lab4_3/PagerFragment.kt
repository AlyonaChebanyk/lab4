package com.example.lab4_3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.page_layout.*

class PagerFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.page_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        //getting information about position and color of fragment
        arguments?.let {
            container.setBackgroundColor(it.getInt("color"))
            textView.text = "Page ${it.getInt("position")}"
        }
    }
}
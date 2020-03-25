package com.example.lab4_2

import android.os.Bundle
import android.system.Os.link
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), OnFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onFragmentInteraction(url: String) {
        //call a function in WebViewActivity that load url
        val fragment = supportFragmentManager
            .findFragmentById(R.id.webViewFragment) as WebViewFragment
        if (fragment.isInLayout) {
            fragment.loadUrl(url)
        }
    }
}

package com.example.lab4_2

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_list.*

/**
 * A simple [Fragment] subclass.
 */
class ListFragment : Fragment() {

    lateinit var mListener: OnFragmentInteractionListener

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        googleTextView.setOnClickListener {
            loadUrl("https://www.google.com/")
        }

        facebookTextView.setOnClickListener {
            loadUrl("https://www.facebook.com/")
        }

        twitterTextView.setOnClickListener {
            loadUrl("https://www.twitter.com/")
        }

        xda_developerTextView.setOnClickListener {
            loadUrl("https://www.xda-developers.com/")
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            mListener = context as OnFragmentInteractionListener
        } catch (e: ClassCastException) {
            throw ClassCastException(
                "$context должен реализовывать интерфейс OnFragmentInteractionListener"
            )
        }
    }

    fun loadUrl(url:String){
        mListener.onFragmentInteraction(url)
    }

}

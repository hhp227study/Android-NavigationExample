package com.hhp227.navigationexample.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hhp227.navigationexample.R

class ThirdFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    companion object {
        fun newInstance() = ThirdFragment()
    }
}
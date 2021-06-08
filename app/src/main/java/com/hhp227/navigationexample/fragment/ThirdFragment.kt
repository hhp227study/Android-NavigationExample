package com.hhp227.navigationexample.fragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.hhp227.navigationexample.R
import kotlinx.android.synthetic.main.fragment_main.*

class ThirdFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }
}
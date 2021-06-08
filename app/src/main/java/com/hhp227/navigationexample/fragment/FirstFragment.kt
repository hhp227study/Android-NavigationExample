package com.hhp227.navigationexample.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.hhp227.navigationexample.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener { v ->
            if (edit_text.text.isEmpty()) {
                Toast.makeText(requireContext(), "메시지를 입력하세요.", Toast.LENGTH_LONG).show()
            } else {
                val text = edit_text.text.toString()
                val direction = MainFragmentDirections.actionMainFragmentToDetailFragment(text)

                requireActivity().findNavController(R.id.fragment).navigate(direction)
            }
        }
    }
}
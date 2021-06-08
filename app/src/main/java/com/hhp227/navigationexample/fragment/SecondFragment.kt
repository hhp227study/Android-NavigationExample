package com.hhp227.navigationexample.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hhp227.navigationexample.R
import com.hhp227.navigationexample.adapter.SimpleListAdapter
import kotlinx.android.synthetic.main.fragment_second.*
import kotlinx.android.synthetic.main.item_list.view.*

class SecondFragment : Fragment() {
    private val list = listOf("첫번째 아이템", "두번째 아이템", "세번째 아이템", "네번째 아이템")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycler_view.apply {
            layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
            adapter = SimpleListAdapter(list).apply {
                setOnItemClickListener { v, _ ->
                    val title = v.text_view.text.toString()
                    val direction = MainFragmentDirections.actionMainFragmentToDetailFragment(title)

                    requireActivity().findNavController(R.id.fragment).navigate(direction)
                }
            }
        }
    }
}
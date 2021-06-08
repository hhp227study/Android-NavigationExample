package com.hhp227.navigationexample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hhp227.navigationexample.R
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_list.view.*

class SimpleListAdapter(private val list: List<String>) : RecyclerView.Adapter<SimpleListAdapter.SimpleViewHolder>() {
    private lateinit var onItemClickListener: OnItemClickListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder {
        return SimpleViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false))
    }

    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    fun setOnItemClickListener(listener: OnItemClickListener) {
        onItemClickListener = listener
    }

    inner class SimpleViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {
        fun bind(title: String) {
            containerView.text_view.text = title
        }

        init {
            containerView.setOnClickListener { v -> onItemClickListener.onItemClick(v, adapterPosition) }
        }
    }

    fun interface OnItemClickListener {
        fun onItemClick(v: View, pos: Int)
    }
}
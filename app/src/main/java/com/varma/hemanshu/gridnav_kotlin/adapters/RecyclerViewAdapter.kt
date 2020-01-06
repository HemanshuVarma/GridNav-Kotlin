package com.varma.hemanshu.gridnav_kotlin.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.varma.hemanshu.gridnav_kotlin.R
import com.varma.hemanshu.gridnav_kotlin.models.ItemModel
import kotlinx.android.synthetic.main.list_item_layout.view.*

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<ItemModel> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.list_item_layout,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ItemViewHolder -> {
                holder.bind(items[position])
            }
        }

    }

    fun submitList(itemModelList: List<ItemModel>) {
        items = itemModelList
    }

    class ItemViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageItem = itemView.item_image
        private val textItem = itemView.item_text

        fun bind(itemModel: ItemModel) {
            imageItem.setImageResource(itemModel.image)
            textItem.text = itemModel.name
        }
    }
}
package com.example.secondkotlin

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.biolistitem.view.*

class BioViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
    fun bind(item: BioItem){

        itemView.textView.text = item.key
        itemView.textView2.text = item.value
    }
}
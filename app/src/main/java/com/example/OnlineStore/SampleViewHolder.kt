package com.example.OnlineStore

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.sample_list_item.view.*

class SampleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    fun bind(item: SampleData) = with(itemView){
        item_image.setImageResource(item.itemImage)
        item_name.text = item.itemName
        item_address.text = item.itemAds
        item_image2.setImageResource(item.itemImage2)
    }
}
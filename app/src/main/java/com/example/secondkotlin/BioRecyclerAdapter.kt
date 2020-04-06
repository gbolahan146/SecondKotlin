package com.example.secondkotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BioRecyclerAdapter(private val items: List<BioItem>): RecyclerView.Adapter<BioViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BioViewHolder {
        return BioViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.biolistitem, parent, false))
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: BioViewHolder, position: Int) = holder.bind(items[position])
}
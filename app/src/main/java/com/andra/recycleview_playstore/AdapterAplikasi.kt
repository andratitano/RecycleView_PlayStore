package com.andra.recycleview_playstore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import kotlinx.android.synthetic.main.category_item.view.*

class AdapterAplikasi(val listApp: ArrayList<AplikasiClass>): RecyclerView.Adapter<AdapterAplikasi.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listApp.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var image = holder.itemView.ivImage

        Glide.with(holder.itemView.context)
            .load(listApp[position].logo)
            .transform(RoundedCorners(64))
            .into(image)

        holder.itemView.tvName.setText(listApp[position].name)
        holder.itemView.tvSize.setText("${listApp[position].size.toString()} MB")
    }
}
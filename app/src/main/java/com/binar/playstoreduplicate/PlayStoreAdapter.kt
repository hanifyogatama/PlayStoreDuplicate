package com.binar.playstoreduplicate

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import kotlinx.android.synthetic.main.apps_item.view.*

class PlayStoreAdapter(val listPlayStore: ArrayList<PlayStore>) :
    RecyclerView.Adapter<PlayStoreAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.apps_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listPlayStore.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(holder.itemView.context).load(listPlayStore[position].imageLogo).into(holder.itemView.ivLogoApp)
        holder.itemView.tvNameApp.setText(listPlayStore[position].namaApp)
        holder.itemView.tvSizeApp.setText(listPlayStore[position].sizeApp)
    }
}
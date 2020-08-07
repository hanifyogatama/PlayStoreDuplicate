package com.binar.playstoreduplicate

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.category.view.*

class CategoryAdapter (val listCategory: ArrayList<CategoryData>):
    RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    private val viewPoll = RecyclerView.RecycledViewPool()

    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        internal val tvTitle : TextView
        internal val rvSubItem: RecyclerView

        init {
            tvTitle = itemView.findViewById(R.id.tvCategory)
            rvSubItem = itemView.findViewById(R.id.rvContent)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return listCategory.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = listCategory[position]
        holder.itemView.tvCategory.setText(listCategory[position].categoryName)

        val layoutManager = LinearLayoutManager(holder.rvSubItem.context,LinearLayoutManager.HORIZONTAL,false)

        layoutManager.initialPrefetchItemCount = item.listContent.size

        // create sub item view adapter
        val subItemAdapter = PlayStoreAdapter(item.listContent)

        holder.rvSubItem.layoutManager = layoutManager
        holder.rvSubItem.adapter = subItemAdapter
        holder.rvSubItem.setRecycledViewPool(viewPoll)

    }
}

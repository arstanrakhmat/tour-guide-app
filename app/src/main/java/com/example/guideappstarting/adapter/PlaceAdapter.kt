package com.example.guideappstarting.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.guideappstarting.dataclass.Place
import com.example.guideappstarting.R

class PlaceAdapter(var list: List<Place>): RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {

//    private var titles = arrayOf("Monument One", "Monument Two", "Monument Three")
//
//    private var details = arrayOf("Monument one detail", "Monument two detail", "Monument three detail")
//
//    private var images = intArrayOf(R.drawable.monuments1, R.drawable.monuments2, R.drawable.monuments3)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PlaceAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: PlaceAdapter.ViewHolder, position: Int) {
        var isVisible = false

        val onePlace = list[position]
        holder.itemTitle.text = onePlace.title
        holder.itemDetail.text = onePlace.detail
        holder.itemImage.setImageResource(onePlace.image)

        holder.expandableLayout.visibility = if (isVisible) View.VISIBLE else View.GONE

        holder.moreDetail.setOnClickListener {
            isVisible = true
            notifyItemChanged(position)
        }
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        var moreDetail: ImageView
        var expandableLayout : RelativeLayout

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
            moreDetail = itemView.findViewById(R.id.more_info_bar)
            expandableLayout = itemView.findViewById(R.id.expandable_layout)
        }
    }
}
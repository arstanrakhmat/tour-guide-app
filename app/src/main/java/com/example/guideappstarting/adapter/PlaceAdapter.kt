package com.example.guideappstarting.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.guideappstarting.dataclass.Place
import com.example.guideappstarting.R

class PlaceAdapter(var list: List<Place>): RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {

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

        val onePlace = list[position]
        holder.itemTitle.text = onePlace.title
        holder.itemDetail.text = onePlace.detail
        holder.itemImage.setImageResource(onePlace.image)
        holder.texts.text = onePlace.text
        holder.location.text = onePlace.location
        holder.phoneNumber.text = onePlace.phoneNumber

        val isVisible : Boolean = onePlace.visibility
        holder.expandableLayout.visibility = if (isVisible) View.VISIBLE else View.GONE

        holder.moreDetail.setOnClickListener {
            onePlace.visibility = !onePlace.visibility
            notifyItemChanged(position)
        }
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        var texts: TextView
        val location: TextView
        val phoneNumber: TextView
        var moreDetail: ImageView
        var expandableLayout : ConstraintLayout

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
            moreDetail = itemView.findViewById(R.id.more_info_bar)
            expandableLayout = itemView.findViewById(R.id.expandable_layout)
            texts = itemView.findViewById(R.id.info)
            location = itemView.findViewById(R.id.location)
            phoneNumber = itemView.findViewById(R.id.phoneNumber)
        }
    }
}
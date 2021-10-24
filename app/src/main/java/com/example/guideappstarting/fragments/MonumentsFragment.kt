package com.example.guideappstarting.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.guideappstarting.dataclass.Place
import com.example.guideappstarting.R
import com.example.guideappstarting.adapter.PlaceAdapter

class MonumentsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_monuments, container, false)

        val listInfo = mutableListOf(
            Place(R.drawable.monuments1, "Memorial Monument", "Uch-Korgon village")
        )
        val adapter = PlaceAdapter(listInfo)

        val recyclerView = view?.findViewById<RecyclerView>(R.id.monument_recyclerview)

        recyclerView?.adapter = adapter

        recyclerView?.layoutManager = LinearLayoutManager(view?.context)

        return view
    }
}
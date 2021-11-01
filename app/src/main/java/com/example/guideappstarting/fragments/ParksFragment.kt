package com.example.guideappstarting.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.guideappstarting.R
import com.example.guideappstarting.adapter.PlaceAdapter
import com.example.guideappstarting.dataclass.Place

class ParksFragment : Fragment() {

    private val info: String = "" +
            "This big and beautiful park is located in the centre of the city." +
            " There are always a lot of people in this popular place. " +
            "There are lovely sunlit lawns and quiet spots hidden in the shade of trees." +
            " Right in the middle of the park there is a big lake with crystal clear water." +
            " Swans, ducks and other water birds live there." +
            "\n" +
            "In summer this park becomes a very lively place." +
            " Some people come to picnic here. Others just sit on soft grass while reading an interesting book or resting. " +
            "During hot days people come here to lie in the sun. " +
            "For those who prefer active sports, there is a sports ground to play volleyball and other sport games."

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_parks, container, false)
        // Inflate the layout for this fragment

        val listInfo = mutableListOf(
            Place(R.drawable.park11, "Park", "KK Center", false, info,
                "Р-152, Kyzyl-Kiya")
        )

        val adapter = PlaceAdapter(listInfo)

        val recyclerView = view?.findViewById<RecyclerView>(R.id.park_recyclerview)

        recyclerView?.adapter = adapter

        recyclerView?.layoutManager = LinearLayoutManager(view?.context)

        recyclerView?.addItemDecoration(
            DividerItemDecoration(
                context,
                DividerItemDecoration.VERTICAL
            )
        )

        return view
    }
}
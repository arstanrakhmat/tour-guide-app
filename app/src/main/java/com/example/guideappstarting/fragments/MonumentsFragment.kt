package com.example.guideappstarting.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.guideappstarting.dataclass.Place
import com.example.guideappstarting.R
import com.example.guideappstarting.adapter.PlaceAdapter
import com.example.guideappstarting.enum.Strings

class MonumentsFragment : Fragment() {

     val monument1: String =
         "Monument \"Soldiers who died in the Great Patriotic War 1941-1945.\" " +
                 "in the village of Uch-Korgon, Batken region.\n" +
                 "\n" +
                 "In 1965, in the village of Uch-Korgon, " +
                 "a Monument to those who died in the Great Patriotic War of 1941-1945 was erected.\n" +
                 " The monument is a three-meter bronze sculpture of a warrior, installed on a four-sided pedestal.\n"

    val monument2: String =
        "The monument is installed in the heart of Kyzyl-Kiya, on the square. " +
                "Its height together with the pedestal is 17 m, 55 cm. " +
                "It is a bronze statue depicting a national hero riding a mighty horse. " +
                "The author-sculptor is Bazarbay Sydykov, and the opening of the monument (August 31, 2019)"

    val monument3: String =
        "The monument is a full-length sculpture of a miner holding a piece of coal in his outstretched right hand. " +
                "The sculpture is made of cast iron. The weight of the sculpture is 22 tons. " +
                "The lump of coal that the miner holds in his outstretched hand is made of aluminum, " +
                "its weight is 90 kilograms\nThe monument \"Glory to the Miner's Labor\" is the \"visiting card\" of the city. " +
                "Filming of the monument was included" +
                " in the 1970 film-concert with the participation of Tamara Miansarova \"Solar Ballad\""


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
            Place(R.drawable.monuments1, "Memorial Monument", "Uch-Korgon village", false, monument1,
                "Uch-Korgon", "+996771677010"),
            Place(R.drawable.monuments2, "Manas", "Kyzyl-Kiya", false, monument2,
                "Uch-Korgon", "+996771677010"),
            Place(R.drawable.monuments2, "Miner's Labor", "Kyzyl-Kiya", false, monument3,
                "Uch-Korgon", "+996771677010")
        )
        val adapter = PlaceAdapter(listInfo)

        val recyclerView = view?.findViewById<RecyclerView>(R.id.monument_recyclerview)

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
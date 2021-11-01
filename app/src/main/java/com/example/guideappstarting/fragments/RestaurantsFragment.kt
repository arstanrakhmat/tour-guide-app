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

class RestaurantsFragment : Fragment() {

    private val rest1: String = "Nice and cozy cafe. Everything is clean and tidy."
    private val rest2: String = "An interesting place, very atmospheric, friendly waiters, beautiful and unusual desserts.\n" +
            "Large selection of breakfasts! Gluten-free desserts, sugar-free are great."
    private val rest3: String = "Very interior place! Nice and tasty. Great place in the city center for brunch with friends! A large selection of desserts that scatter your eyes, you want to try everything!" +
            " )) delicious chocolate cheesecake with walnuts! There is a cool children's room!"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_restaurants, container, false)

        val listInfo = mutableListOf(
            Place(R.drawable.restraurant1, "Altyn-Ordo", "R-152, Kyzyl-Kiya", false, rest1,
            "R-152, Kyzyl-Kiya", "0771677010"),
            Place(R.drawable.restaurant2, "Sariya", "Isanova 6, Kyzyl-Kya", false, rest2,
            " 7449+VW7, Kyzyl-Kiya", "0558558145"),
            Place(R.drawable.restaurant3, "Kafe #1", "Tash Bazary", false, rest3,
            "ул.Молодежная/Асаналиева, Kyzyl-Kiya", "0707707733")
        )

        val adapter = PlaceAdapter(listInfo)

        val recyclerView = view?.findViewById<RecyclerView>(R.id.restaurants_recyclerview)

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
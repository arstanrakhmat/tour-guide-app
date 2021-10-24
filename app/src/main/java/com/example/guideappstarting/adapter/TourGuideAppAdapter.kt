package com.example.guideappstarting.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.guideappstarting.fragments.MonumentsFragment
import com.example.guideappstarting.fragments.ParksFragment
import com.example.guideappstarting.fragments.RestaurantsFragment

class TourGuideAppAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    val fragmentsNumber = 3

    override fun getItemCount(): Int {
        return fragmentsNumber
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> {
                MonumentsFragment()
            }
            1 -> {
                ParksFragment()
            }
            2 ->  {
                RestaurantsFragment()
            }
            else -> {
                Fragment()
            }
        }
    }
}
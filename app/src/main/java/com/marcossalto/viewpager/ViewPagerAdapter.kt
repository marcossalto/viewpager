package com.marcossalto.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * Created by Marcos Salto on 10/10/2020.
 */
class ViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 3
    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> { LeftFragment() }
            1 -> { CentralFragment() }
            2 -> { RightFragment() }
            else -> LeftFragment()
        }
    }
}
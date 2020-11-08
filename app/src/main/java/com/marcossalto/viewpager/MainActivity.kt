package com.marcossalto.viewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by Marcos Salto on 10/10/2020.
 */

class MainActivity : AppCompatActivity() {
    private val adapter by lazy { ViewPagerAdapter(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewpager.adapter = adapter
        val tabLayoutMediator = TabLayoutMediator(tab_layout, viewpager) { tab, position ->
            when (position + 1) {
                1 -> {
                    tab.text = getString(R.string.left_fragment)
                    tab.setIcon(R.drawable.ic_baseline_call_24)
                    val badge: BadgeDrawable = tab.orCreateBadge
                    badge.backgroundColor =
                        ContextCompat.getColor(applicationContext, R.color.colorAccent)
                    badge.number = 120
                    badge.maxCharacterCount = 3
                    badge.isVisible = true
                }
                2 -> {
                    tab.text = getString(R.string.central_fragment)
                    tab.setIcon(R.drawable.ic_baseline_camera_alt_24)
                    val badge: BadgeDrawable = tab.orCreateBadge
                    badge.backgroundColor =
                        ContextCompat.getColor(applicationContext, R.color.colorAccent)
                    badge.number = 7
                    badge.maxCharacterCount = 3
                    badge.isVisible = true
                }
                3 -> {
                    tab.text = getString(R.string.right_fragment)
                    tab.setIcon(R.drawable.ic_baseline_bug_report_24)
                    val badge: BadgeDrawable = tab.orCreateBadge
                    badge.backgroundColor =
                        ContextCompat.getColor(applicationContext, R.color.colorAccent)
                    badge.number = 3
                    badge.maxCharacterCount = 3
                    badge.isVisible = true
                }
            }
        }
        tabLayoutMediator.attach()
    }
}
package com.xkcd.dingm.components

import android.content.Context
import android.content.Intent
import android.support.design.widget.TabLayout
import com.xkcd.dingm.R
import com.xkcd.dingm.activities.AnotherActivity

class XKCDTabBar : TabLayout, TabLayout.OnTabSelectedListener{


    var tab_item_spend      : Tab? = null
    var tab_item_save       : Tab? = null
    var tab_item_earn       : Tab? = null
    var tab_item_profile    : Tab? = null

    constructor(context: Context) : super(context)

    init {
        this.tab_item_spend = this.newTab()
            .setText(R.string.spend)
            .setIcon(R.drawable.tab_save)
        this.tab_item_save = this.newTab()
            .setText(R.string.save)
            .setIcon(R.drawable.tab_save)
        this.tab_item_earn = this.newTab()
            .setText(R.string.earn)
            .setIcon(R.drawable.tab_save)
        this.tab_item_profile = this.newTab()
            .setText(R.string.profile)
            .setIcon(R.drawable.tab_save)

        this.addTab(tab_item_spend!!)
        this.addTab(tab_item_save!!)
        this.addTab(tab_item_earn!!)
        this.addTab(tab_item_profile!!)

        this.setSelectedTabIndicatorColor(0)
        this.addOnTabSelectedListener(this)
    }

    override fun onTabSelected(tab: Tab?) {
        val intent = Intent(context, AnotherActivity::class.java)
        context.startActivity(intent)
    }

    override fun onTabUnselected(tab: Tab?) {
        // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTabReselected(tab: Tab?) {
        // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
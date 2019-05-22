package com.xkcd.dingm.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.widget.LinearLayout
import android.widget.TextView
import com.xkcd.dingm.R
import com.xkcd.dingm.components.XKCDTabBar
import com.xkcd.dingm.sections.HomeView
import com.xkcd.dingm.sections.XKCDSectionToday


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val container = HomeView(this)
        this.setContentView(container)
    }
}

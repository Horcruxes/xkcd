package com.xkcd.dingm.sections

import android.content.Context
import android.widget.LinearLayout
import android.widget.TextView
import com.xkcd.dingm.R
import com.xkcd.dingm.components.XKCDTabBar

class HomeView : LinearLayout {

    constructor(context: Context) : super(context)

    init {
        this.layoutParams   = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        this.orientation    = VERTICAL

        val section_today   = XKCDSectionToday(context)
        this.addView(section_today)

        val tab_bar         = XKCDTabBar(context, R.style.XKCDTabStyle)
        this.addView(tab_bar)
    }

}
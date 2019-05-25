package com.xkcd.dingm.Views

import android.content.Context
import android.widget.LinearLayout
import com.xkcd.dingm.R
import com.xkcd.dingm.components.XKCDTabBar
import com.xkcd.dingm.sections.XKCDFutureTransactionsView
import com.xkcd.dingm.sections.XKCDSectionCurrent
import com.xkcd.dingm.sections.XKCDSectionFuture

class HomeView : LinearLayout {

    constructor(context: Context) : super(context)

    init {
        this.layoutParams   = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        this.orientation    = VERTICAL

        val section_future  = XKCDSectionFuture(context)
        val list_view       = XKCDFutureTransactionsView(context)
        val section_current = XKCDSectionCurrent(context)
        val tab_bar         = XKCDTabBar(context)


        this.addView(section_future)
        this.addView(list_view)
        this.addView(section_current)
        this.addView(tab_bar)
    }

}
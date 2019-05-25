package com.xkcd.dingm.views

import android.content.Context
import android.util.Log
import android.widget.LinearLayout
import com.xkcd.dingm.components.XKCDTabBar
import com.xkcd.dingm.interfaces.GetDataListener
import com.xkcd.dingm.models.XKCDResponse
import com.xkcd.dingm.sections.XKCDFutureTransactionsView
import com.xkcd.dingm.sections.XKCDSectionCurrent
import com.xkcd.dingm.sections.XKCDSectionFuture

class HomeView : LinearLayout, GetDataListener {
    var section_future  : XKCDSectionFuture?            = null
    var list_view       : XKCDFutureTransactionsView?   = null
    var section_current : XKCDSectionCurrent?           = null
    var tab_bar         : XKCDTabBar?                   = null

    constructor(context: Context) : super(context)

    init {
        this.layoutParams   = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        this.orientation    = VERTICAL

        this.section_future = XKCDSectionFuture(context)
        this.list_view       = XKCDFutureTransactionsView(context)
        this.section_current = XKCDSectionCurrent(context)
        this.tab_bar         = XKCDTabBar(context)


        this.addView(section_future)
        this.addView(list_view)
        this.addView(section_current)
        this.addView(tab_bar)
    }

    override fun onDataReceived(response: XKCDResponse){
        val (balance, transactions) = response
        this.list_view!!.populateTransactions(transactions)
        Log.d("REQUEST" ,  "Response is: ${response}")
    }

}
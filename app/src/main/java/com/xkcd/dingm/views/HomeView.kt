package com.xkcd.dingm.views

import android.content.Context
import android.util.Log
import android.widget.LinearLayout
import com.xkcd.dingm.components.XKCDTabBar
import com.xkcd.dingm.interfaces.GetDataListener
import com.xkcd.dingm.models.XKCDResponse
import com.xkcd.dingm.sections.XKCDBalanceView
import com.xkcd.dingm.sections.XKCDFutureTransactionsView
import com.xkcd.dingm.sections.XKCDSectionToday
import com.xkcd.dingm.sections.XKCDCommingUp

class HomeView : LinearLayout, GetDataListener {
    var section_balance : XKCDBalanceView?                = null
    var section_today   : XKCDCommingUp?                = null
    var list_view       : XKCDFutureTransactionsView?   = null
    var section_future  : XKCDSectionToday?             = null
    var tab_bar         : XKCDTabBar?                   = null

    constructor(context: Context) : super(context)

    init {
        this.layoutParams    = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        this.orientation     = VERTICAL

        this.section_balance = XKCDBalanceView(context)
        this.section_today   = XKCDCommingUp(context)
        this.list_view       = XKCDFutureTransactionsView(context)
        this.section_future  = XKCDSectionToday(context)
        this.tab_bar         = XKCDTabBar(context)


        this.addView(section_balance)
        this.addView(section_today)
        this.addView(list_view)
        this.addView(section_future)
        this.addView(tab_bar)
    }

    override fun onDataReceived(response: XKCDResponse){
        val (balance, transactions) = response
        this.list_view!!.populateTransactions(transactions)
        this.section_balance!!.updateBalance(balance)

        Log.d("REQUEST" ,  "Response is: ${response}")
    }

}
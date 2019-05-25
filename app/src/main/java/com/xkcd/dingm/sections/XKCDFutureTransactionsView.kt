package com.xkcd.dingm.sections

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.LinearLayoutManager
import com.xkcd.dingm.Adapters.XKCDTransactionAdapter
import com.xkcd.dingm.activities.MainActivity
import com.xkcd.dingm.models.XKCDTransaction


class XKCDFutureTransactionsView : RecyclerView {

    var transactions        : MutableList<XKCDTransaction>? = ArrayList<XKCDTransaction>();

    constructor(context: Context) : super(context)

    init {
        this.layoutParams               = LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
        val horizontalLayoutManager     = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        this.layoutManager              = horizontalLayoutManager
        val activity: MainActivity = context as MainActivity

        this.populateTransactions()
        this.adapter = XKCDTransactionAdapter(context, this.transactions!!, activity)

    }

    fun populateTransactions() {

        //TODO: connect with API results from updates. This should be empty by default
        this.transactions!!.add(XKCDTransaction("Yesterday", 200.0))
        this.transactions!!.add(XKCDTransaction("In 2 days", 198.0))
        this.transactions!!.add(XKCDTransaction("Telstra", 124.0))
        this.transactions!!.add(XKCDTransaction("Suncorp", 700.0))
        this.transactions!!.add(XKCDTransaction("Microsoft", 600.0))
        this.transactions!!.add(XKCDTransaction("Amazon", 7.0))
        this.transactions!!.add(XKCDTransaction("Yesterday", 200.0))
        this.transactions!!.add(XKCDTransaction("In 2 days", 198.0))
        this.transactions!!.add(XKCDTransaction("Telstra", 124.0))
        this.transactions!!.add(XKCDTransaction("Suncorp", 700.0))
        this.transactions!!.add(XKCDTransaction("Microsoft", 600.0))
        this.transactions!!.add(XKCDTransaction("Amazon", 7.0))
        this.transactions!!.add(XKCDTransaction("Yesterday", 200.0))
        this.transactions!!.add(XKCDTransaction("In 2 days", 198.0))
        this.transactions!!.add(XKCDTransaction("Telstra", 124.0))
        this.transactions!!.add(XKCDTransaction("Suncorp", 700.0))
        this.transactions!!.add(XKCDTransaction("Microsoft", 600.0))
        this.transactions!!.add(XKCDTransaction("Amazon", 7.0))

    }


}


package com.xkcd.dingm.sections

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.LinearLayoutManager
import com.xkcd.dingm.adapters.XKCDTransactionAdapter
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

        this.populateTransactions(null)
        this.adapter = XKCDTransactionAdapter(context, this.transactions!!, activity)

    }

    fun populateTransactions(transactions: MutableList<XKCDTransaction>?) {

        if (transactions != null) {
            val adapter: XKCDTransactionAdapter = this.adapter as XKCDTransactionAdapter
            adapter.transactions = transactions
            adapter.notifyDataSetChanged()
            return
        }


        //TODO : This is not requried any more, to clear
        this.transactions!!.clear()
        this.transactions!!.add(XKCDTransaction("Telstra", "Yesterday", 200.0))
        this.transactions!!.add(XKCDTransaction("Telstra", "In 2 days", 198.0))
        this.transactions!!.add(XKCDTransaction("Telstra", "Telstra", 124.0))
        this.transactions!!.add(XKCDTransaction("Telstra", "Suncorp", 700.0))
        this.transactions!!.add(XKCDTransaction("Telstra", "Microsoft", 600.0))
        this.transactions!!.add(XKCDTransaction("Telstra", "Amazon", 7.0))
        this.transactions!!.add(XKCDTransaction("Telstra", "Yesterday", 200.0))
        this.transactions!!.add(XKCDTransaction("Telstra", "In 2 days", 198.0))
        this.transactions!!.add(XKCDTransaction("Telstra", "Telstra", 124.0))
        this.transactions!!.add(XKCDTransaction("Telstra", "Suncorp", 700.0))
        this.transactions!!.add(XKCDTransaction("Telstra", "Microsoft", 600.0))
        this.transactions!!.add(XKCDTransaction("Telstra", "Amazon", 7.0))
        this.transactions!!.add(XKCDTransaction("Telstra", "Yesterday", 200.0))
        this.transactions!!.add(XKCDTransaction("Telstra", "In 2 days", 198.0))
        this.transactions!!.add(XKCDTransaction("Telstra", "Telstra", 124.0))
        this.transactions!!.add(XKCDTransaction("Telstra", "Suncorp", 700.0))
        this.transactions!!.add(XKCDTransaction("Telstra", "Microsoft", 600.0))
        this.transactions!!.add(XKCDTransaction("Telstra", "Amazon", 7.0))

    }
}


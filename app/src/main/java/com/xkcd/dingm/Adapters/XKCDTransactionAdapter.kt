package com.xkcd.dingm.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.xkcd.dingm.components.XKCDFutureTransactionItemView
import com.xkcd.dingm.interfaces.ItemClickListener
import com.xkcd.dingm.models.XKCDTransaction

class XKCDTransactionAdapter : RecyclerView.Adapter<XKCDTransactionViewHolder> {

    var context             : Context?           = null;
    var transactions        : MutableList<XKCDTransaction>? = ArrayList<XKCDTransaction>();
    var itemClickListener   : ItemClickListener? = null

    constructor(context:Context, transactions: MutableList<XKCDTransaction>, listener: ItemClickListener? = null) : super(){
        this.context            = context
        this.transactions       = transactions
        this.itemClickListener  = listener
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): XKCDTransactionViewHolder {
        var item = XKCDFutureTransactionItemView(this.context!!)
        return XKCDTransactionViewHolder(item, this.itemClickListener);
    }

    override fun onBindViewHolder(holder: XKCDTransactionViewHolder, position: Int) {
        var itemView : XKCDFutureTransactionItemView = holder.itemView as XKCDFutureTransactionItemView
        val transaction = transactions!!.get(position)
        itemView.updateContent(transaction)
    }

    override fun getItemCount(): Int {
        return transactions!!.size
    }


}
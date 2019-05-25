package com.xkcd.dingm.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.xkcd.dingm.components.XKCDFutureTransactionItemView
import com.xkcd.dingm.interfaces.ItemClickListener
import com.xkcd.dingm.models.XKCDTransaction

class XKCDTransactionAdapter : RecyclerView.Adapter<XKCDTransactionViewHolder> {

    var context             : Context?                      = null;
    var transactions        : MutableList<XKCDTransaction>? = ArrayList<XKCDTransaction>();
    var item_click_listener : ItemClickListener?            = null

    constructor(context:Context, transactions: MutableList<XKCDTransaction>, listener: ItemClickListener? = null) : super(){
        this.context                = context
        this.transactions           = transactions
        this.item_click_listener    = listener
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): XKCDTransactionViewHolder {
        var item = XKCDFutureTransactionItemView(this.context!!)
        return XKCDTransactionViewHolder(item, this.item_click_listener);
    }

    override fun onBindViewHolder(holder: XKCDTransactionViewHolder, position: Int) {
        var item_view : XKCDFutureTransactionItemView = holder.itemView as XKCDFutureTransactionItemView
        val transaction = transactions!!.get(position)
        item_view.updateContent(transaction)
    }

    override fun getItemCount(): Int {
        return transactions!!.size
    }


}
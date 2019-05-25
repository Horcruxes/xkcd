package com.xkcd.dingm.adapters

import android.support.v7.widget.RecyclerView
import android.view.View
import com.xkcd.dingm.interfaces.ItemClickListener


class XKCDTransactionViewHolder : RecyclerView.ViewHolder , View.OnClickListener{

    var click_listener : ItemClickListener?     = null

    constructor(itemView: View, listener: ItemClickListener? = null) : super(itemView) {
        this.click_listener = listener
    }

    init {
        this.itemView.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        click_listener?.onItemClicked(view, this.adapterPosition)
    }
}


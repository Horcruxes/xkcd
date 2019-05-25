package com.xkcd.dingm.Adapters

import android.support.v7.widget.RecyclerView
import android.view.View
import com.xkcd.dingm.interfaces.ItemClickListener


class XKCDTransactionViewHolder : RecyclerView.ViewHolder , View.OnClickListener{

    var m_click_listener : ItemClickListener?     = null

    constructor(itemView: View, listener: ItemClickListener? = null) : super(itemView) {
        this.m_click_listener = listener
    }

    init {
        this.itemView.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        m_click_listener?.onItemClicked(view, this.adapterPosition)
    }
}


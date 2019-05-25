package com.xkcd.dingm.sections

import android.content.Context
import android.widget.LinearLayout
import android.widget.TextView
import com.xkcd.dingm.R
import com.xkcd.dingm.components.XKCDCurrentTransactionView

class XKCDSectionCurrent : LinearLayout {

    var title   : TextView?                     = null
    var content : XKCDCurrentTransactionView?   = null

    constructor(context: Context) : super(context)

    init {
        this.orientation    = VERTICAL

        this.title          = TextView(context)
        this.content        = XKCDCurrentTransactionView(context)

        this.setTitle()

        this.addView(title)
        this.addView(content)

    }

    fun setTitle() {
        this.title!!.setText(R.string.today)
        this.title!!.textSize = 20.0f
        this.title!!.setPadding(50,50,50,50)
    }

}
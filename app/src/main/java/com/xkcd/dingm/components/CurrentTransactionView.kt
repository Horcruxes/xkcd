package com.xkcd.dingm.components

import android.content.Context
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.xkcd.dingm.R
import com.xkcd.dingm.Utils.Constants

class CurrentTransactionView : LinearLayout {
    var brand_logo          : ImageView?    = null
    var brand_name          : TextView?     = null
    var current_transaction : TextView?     = null
    var transaction_amount  : Double        = 0.0


    constructor(context: Context) : super(context)

    init {

        this.layoutParams   = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
        this.brand_logo     = ImageView(context)
        this.brand_logo!!.setImageResource(R.drawable.tab_save)

        this.brand_name     = TextView(context)
        this.brand_name!!.setText(R.string.woolworth)

        this.current_transaction = TextView(context)
        this.current_transaction!!.text = Constants.FORMAT_PRECISION.format(this.transaction_amount)

        this.addView(this.brand_logo)
        this.addView(this.brand_name)
        this.addView(this.current_transaction)

    }

    fun updateTransactionAmount(amount: Double){
        this.transaction_amount = amount
        this.current_transaction!!.text = Constants.FORMAT_PRECISION.format(this.transaction_amount)

    }


}


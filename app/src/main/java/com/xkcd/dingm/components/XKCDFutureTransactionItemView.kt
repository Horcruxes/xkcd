package com.xkcd.dingm.components

import android.content.Context
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.xkcd.dingm.R
import com.xkcd.dingm.Utils.Constants
import com.xkcd.dingm.models.XKCDTransaction

class XKCDFutureTransactionItemView : LinearLayout {

    var brand_logo          : ImageView?    = null
    var time_in_future      : TextView?     = null
    var current_transaction : TextView?     = null
    var transaction_amount  : Double        = 0.0

    constructor(context: Context) : super(context)

    init {

        this.layoutParams   = LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
        this.orientation    = VERTICAL

        this.brand_logo             = ImageView(context)
        this.time_in_future         = TextView(context)
        this.current_transaction    = TextView(context)

        this.setContent()
        this.setStyle()

        this.addView(this.brand_logo)
        this.addView(this.current_transaction)
        this.addView(this.time_in_future)

    }

    fun setContent() {
        this.brand_logo!!           .setImageResource(R.drawable.tab_save)
        this.time_in_future!!       .setText(R.string.yesterday)
        this.current_transaction!!  .setText(Constants.FORMAT_PRECISION.format(this.transaction_amount))
    }

    fun setStyle(){
        this.brand_logo!!           .setPadding(50,50,50,5)

        this.time_in_future!!       .setPadding(50,5,50,50)
        this.time_in_future!!       .textSize = 20.0f

        this.current_transaction!!  .setPadding(50,5,50,5)
        this.current_transaction!!  .setTextColor(resources.getColor(R.color.colorTransactionAmount))
        this.current_transaction!!  .textSize = 20.0f
    }

    fun updateContent(transaction: XKCDTransaction){
        val (brand_name, amount)    = transaction
        this.brand_logo!!           .setImageResource(R.drawable.tab_save)
        this.time_in_future!!       .setText(brand_name)
        this.current_transaction!!  .setText(Constants.FORMAT_PRECISION.format(amount))
    }


}


package com.xkcd.dingm.components

import android.content.Context
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.xkcd.dingm.R
import com.xkcd.dingm.Utils.Constants

class XKCDCurrentTransactionView : LinearLayout {
    var brand_logo          : ImageView?    = null
    var brand_name          : TextView?     = null
    var current_transaction : TextView?     = null
    var transaction_amount  : Double        = 0.0


    constructor(context: Context) : super(context)

    init {

        this.layoutParams               = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
        this.brand_logo                 = ImageView(context)
        this.brand_name                 = TextView(context)
        this.current_transaction        = TextView(context)

        this.setContent()
        this.setStyle()

        this.addView(this.brand_logo)
        this.addView(this.brand_name)
        this.addView(this.current_transaction)

    }

    fun setContent() {
        this.brand_logo!!           .setImageResource(R.drawable.tab_save)
        this.brand_name!!           .setText(R.string.woolworth)
        this.current_transaction!!  .setText(Constants.FORMAT_PRECISION.format(this.transaction_amount))
    }

    fun setStyle(){
        this.brand_logo!!           .setPadding(50,50,50,50)
        this.brand_name!!           .setPadding(50,50,50,50)
        this.brand_name!!           .textSize = 20.0f
        this.current_transaction!!  .setPadding(50,50,50,50)
        this.current_transaction!!  .setTextColor(resources.getColor(R.color.colorTransactionAmount))
        this.current_transaction!!  .setPadding(50,50,50,50)
        this.current_transaction!!  .textSize = 20.0f
    }

    fun updateTransactionAmount(amount: Double){
        this.transaction_amount = amount
        this.current_transaction!!.text = Constants.FORMAT_PRECISION.format(this.transaction_amount)

    }


}


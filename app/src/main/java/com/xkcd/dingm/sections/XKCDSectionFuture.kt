package com.xkcd.dingm.sections

import android.annotation.SuppressLint
import android.content.Context
import android.support.constraint.ConstraintLayout
import android.widget.TextView
import com.xkcd.dingm.R
import android.support.constraint.ConstraintSet
import android.support.constraint.ConstraintSet.PARENT_ID
import com.xkcd.dingm.Utils.Constants


class XKCDSectionFuture : ConstraintLayout {

    var title   : TextView?                 = null
    var amount  : TextView?                  = null

    constructor(context: Context) : super(context)

    init {
        this.layoutParams   = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
        this.title          = TextView(context)
        this.amount         = TextView(context)


        this.addView(title)
        this.addView(amount)

        this.setTitle()
        this.setAmount()
        this.adjustPosition()
    }

    fun setTitle() {
        this.title!!.setId(Constants.titleId);
        this.title!!.setText(com.xkcd.dingm.R.string.future)
        this.title!!.setPadding(50,50,50,50)
        this.title!!.textSize = 20.0f


    }

    @SuppressLint("ResourceAsColor")
    fun setAmount() {
        this.amount!!.setId(Constants.amountId)
        this.amount!!.setTextColor(resources.getColor(R.color.colorTransactionAmount))
        this.amount!!.setText("-$234.45") //TODO: connect with API result
        this.amount!!.setPadding(50,50,50,50)
        this.amount!!.textSize = 20.0f

    }

    fun adjustPosition() {
        var constraintSet = ConstraintSet()
        constraintSet.clone(this)
        constraintSet.connect(this.amount!!.getId(), ConstraintSet.END, PARENT_ID, ConstraintSet.END);
        constraintSet.connect(this.title!!.getId(), ConstraintSet.START, PARENT_ID, ConstraintSet.START);
        constraintSet.applyTo(this);
    }

}
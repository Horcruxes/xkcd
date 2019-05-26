package com.xkcd.dingm.sections

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.widget.TextView
import com.xkcd.dingm.R
import android.support.constraint.ConstraintSet
import android.support.constraint.ConstraintSet.PARENT_ID
import com.xkcd.dingm.models.XKCDBalance
import com.xkcd.dingm.utils.Constants


class XKCDBalanceView : ConstraintLayout {

    var title   : TextView? = null
    var amount  : TextView? = null
    var average : TextView? = null


    constructor(context: Context) : super(context)

    init {
        this.layoutParams   = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
        this.title          = TextView(context)
        this.amount         = TextView(context)
        this.average        = TextView(context)


        this.addView(title)
        this.addView(amount)
        this.addView(average)

        this.setTitle()
        this.setAmount()
        this.setAverage()

        this.adjustPosition()
    }

    fun setTitle() {
        //TODO: Move hard coded number to static configs
        this.title!!.setId(Constants.balance_title_view_id);
        this.title!!.setText(com.xkcd.dingm.R.string.balance_title)
        this.title!!.setPadding(50,50,50,50)
        this.title!!.textSize = 20.0f
    }

    fun setAmount() {
        //TODO: Move hard coded number to static configs
        this.amount!!.setId(Constants.balance_amount_view_id)
        this.amount!!.setTextColor(resources.getColor(R.color.colorTransactionAmount))
        this.amount!!.setText("") //TODO: connect with API result
        this.amount!!.setPadding(50,50,50,50)
        this.amount!!.textSize = 20.0f
    }


    fun setAverage() {
        //TODO: Move hard coded number to static configs
        this.average!!.setId(Constants.balance_average_view_id)
        this.average!!.setTextColor(resources.getColor(R.color.colorTransactionAmount))
        this.average!!.setText("") //TODO: connect with API result
        this.average!!.setPadding(50,50,50,50)
        this.average!!.textSize = 20.0f
    }

    fun adjustPosition() {
        var constraintSet = ConstraintSet()
        constraintSet.clone(this)
        constraintSet.connect(this.title!!  .getId(), ConstraintSet.BOTTOM, this.amount!! .getId(), ConstraintSet.TOP);
        constraintSet.connect(this.amount!! .getId(), ConstraintSet.BOTTOM, this.average!!.getId(), ConstraintSet.TOP);
        constraintSet.connect(this.average!!.getId(), ConstraintSet.BOTTOM, PARENT_ID,              ConstraintSet.BOTTOM);
        constraintSet.applyTo(this);
    }

    fun updateBalance(balance : XKCDBalance?) {
        this.amount!! .setText(Constants.FORMAT_PRECISION.format(balance?.amount))
        this.average!!.setText(resources.getString(R.string.balance_avarage, balance?.average))
    }

}
package com.xkcd.dingm.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.xkcd.dingm.Views.HomeView
import com.xkcd.dingm.interfaces.ItemClickListener


class MainActivity : AppCompatActivity(), ItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val container = HomeView(this)
        this.setContentView(container)
    }

    override fun onItemClicked(view: View, index:Int) {
        Toast.makeText(this, "You clicked on item position %d".format(index), Toast.LENGTH_SHORT).show();
    }
}

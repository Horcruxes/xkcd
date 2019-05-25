package com.xkcd.dingm.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.android.volley.toolbox.Volley
import com.xkcd.dingm.views.HomeView
import com.xkcd.dingm.interfaces.ItemClickListener
import com.xkcd.dingm.tasks.APIService


class MainActivity : AppCompatActivity(), ItemClickListener {

    var home_view : HomeView? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        //Create Home Page
        super.onCreate(savedInstanceState)
        this.home_view = HomeView(this)
        this.setContentView(this.home_view)

        //Init API Service
        APIService.delelate = this.home_view
        APIService.queue    = Volley.newRequestQueue(this)
    }

     override fun onResume() {
        super.onResume()
        APIService.getData()
    }

    override fun onItemClicked(view: View, index:Int) {
        Toast.makeText(this, "You clicked on item position %d".format(index), Toast.LENGTH_SHORT).show();
    }
}

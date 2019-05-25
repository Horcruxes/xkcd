package com.xkcd.dingm.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.xkcd.dingm.Views.HomeView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val container = HomeView(this)
        this.setContentView(container)
    }
}

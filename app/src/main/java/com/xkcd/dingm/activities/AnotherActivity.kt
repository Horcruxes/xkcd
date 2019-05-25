package com.xkcd.dingm.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView


class AnotherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val container = LinearLayout(this)
        val helloWorld = TextView(this)
        helloWorld.setText("Hello World")
        container.addView(helloWorld)
        this.setContentView(container)
    }
}

package com.xkcd.dingm.tasks

import android.util.Log
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.xkcd.dingm.interfaces.GetDataListener
import com.xkcd.dingm.models.XKCDResponse
import com.xkcd.dingm.utils.Config
import kotlinx.serialization.json.Json



object APIService   {

    var delelate: GetDataListener? = null
    var queue: RequestQueue? = null

    fun getData() {
        val stringRequest = StringRequest(
            Request.Method.GET, Config.API_URL,
            Response.Listener<String> { response ->
                val response_object = Json.parse(XKCDResponse.serializer(), response)
                delelate?.onDataReceived(response_object)
            },
            Response.ErrorListener {
                Log.d("REQUEST Error" ,  "Doesn't work")
            })
        queue?.add(stringRequest)
    }

}
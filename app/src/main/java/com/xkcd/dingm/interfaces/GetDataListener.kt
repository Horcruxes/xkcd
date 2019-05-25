package com.xkcd.dingm.interfaces

import com.xkcd.dingm.models.XKCDResponse

interface GetDataListener {
    fun onDataReceived(response: XKCDResponse) {}
}

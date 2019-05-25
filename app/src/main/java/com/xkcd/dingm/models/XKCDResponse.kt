package com.xkcd.dingm.models
import kotlinx.serialization.*

@Serializable
data class XKCDResponse(val balance: XKCDBalance? = null, val transactions: MutableList<XKCDTransaction> = ArrayList())
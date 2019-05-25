package com.xkcd.dingm.models
import kotlinx.serialization.*

@Serializable
data class XKCDBalance (val amount: Double = 0.0, val average: Double = 0.0, val pay_day: String = "")
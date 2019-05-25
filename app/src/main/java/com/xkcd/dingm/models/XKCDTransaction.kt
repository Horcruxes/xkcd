package com.xkcd.dingm.models
import kotlinx.serialization.*

@Serializable
data class XKCDTransaction (val brand: String = "", val pay_day: String = "", val amount: Double = 0.0)
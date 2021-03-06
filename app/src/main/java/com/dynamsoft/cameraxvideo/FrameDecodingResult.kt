package com.dynamsoft.cameraxvideo

import kotlinx.serialization.Serializable

@Serializable
data class FrameDecodingResult(
    val results:ArrayList<String>,
    val timeSpent:Long
)
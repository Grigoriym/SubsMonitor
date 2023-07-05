package com.grappim.subsmonitor

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
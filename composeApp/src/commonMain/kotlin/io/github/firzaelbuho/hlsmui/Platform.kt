package io.github.firzaelbuho.hlsmui

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
package com.danilkharytonov.architecturepatterns.adapter

interface AdvancedMediaPlayer {
    fun playMP3(file: String)
    fun playMOV(file: String)
    fun stop()
}
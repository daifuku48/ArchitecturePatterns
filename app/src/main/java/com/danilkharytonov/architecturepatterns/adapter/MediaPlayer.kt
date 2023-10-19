package com.danilkharytonov.architecturepatterns.adapter

interface MediaPlayer {
    fun play(type: String, resource: String)
    fun stop()
}
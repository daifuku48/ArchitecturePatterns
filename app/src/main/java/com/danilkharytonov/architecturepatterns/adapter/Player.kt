package com.danilkharytonov.architecturepatterns.adapter

class Player : MediaPlayer {
    private val mediaPlayerAdapter = MediaPlayerAdapter()
    override fun play(type: String, resource: String) {
        mediaPlayerAdapter.play(type, resource)
    }

    override fun stop() {
        mediaPlayerAdapter.stop()
    }

}
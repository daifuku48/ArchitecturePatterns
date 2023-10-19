package com.danilkharytonov.architecturepatterns.adapter

import android.util.Log

open class MediaPlayerAdapter : MediaPlayer {
    private lateinit var advancedMediaPlayer: AdvancedMediaPlayer

    override fun play(type: String, resource: String) {
        if (type.lowercase() == "mp3") {
            advancedMediaPlayer = MediaPlayerMP3()
            advancedMediaPlayer.playMP3(resource)
        } else if (type.lowercase() == "mov") {
            advancedMediaPlayer = MediaPlayerMOV()
            advancedMediaPlayer.playMOV(resource)
        } else {
            Log.d("adapter", "Invalid Media")
        }
    }

    override fun stop() {
        advancedMediaPlayer.stop()
    }
}


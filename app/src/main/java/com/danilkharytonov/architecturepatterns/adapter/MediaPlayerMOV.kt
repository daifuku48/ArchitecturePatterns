package com.danilkharytonov.architecturepatterns.adapter

import android.util.Log

class MediaPlayerMOV : AdvancedMediaPlayer {
    override fun playMP3(file: String) {

    }

    override fun playMOV(file: String) {
        Log.d("mov file", "$file is play")
    }

    override fun stop() {
        Log.d("mov file", "mov file is stop")
    }
}
package com.danilkharytonov.architecturepatterns.adapter

import android.util.Log

class MediaPlayerMP3 : AdvancedMediaPlayer {
    override fun playMP3(file: String) {
        Log.d("mp3 file", "$file is playing")
    }

    override fun playMOV(file: String) {

    }

    override fun stop() {
        Log.d("mp3 file", "mp3 file is stop")
    }
}


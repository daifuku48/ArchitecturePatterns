package com.danilkharytonov.architecturepatterns

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.danilkharytonov.architecturepatterns.adapter.Player
import com.danilkharytonov.architecturepatterns.builder.CustomTextView
import com.danilkharytonov.architecturepatterns.singleton.Singleton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val playerMP3 = Player()
        playerMP3.play("mp3", "file.mp3")
        val playerMOV = Player()
        playerMOV.play("mov", "file.mov")
        val textView = CustomTextView
            .BuilderBase()
            .setText("text")
            .setTextColor(Color.rgb(0,0,0))
            .build()

        val s1 = Singleton.getInstance("VALUE")
        val s2 = Singleton.getInstance("V")
        Log.d("singleton", s2?.value!!)
    }
}
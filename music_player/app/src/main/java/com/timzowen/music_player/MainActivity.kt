package com.timzowen.music_player

import android.media.AudioManager
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.lang.Exception

class MainActivity : AppCompatActivity() {

     lateinit var btnPlay : FloatingActionButton
     lateinit var btnPause : FloatingActionButton
     var mediaPlayer : MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlay = findViewById(R.id.feb_play)
        btnPause = findViewById(R.id.fab_pause)

        btnPlay.setOnClickListener {
            playAudio()
        }

        btnPause.setOnClickListener {
            pauseAudio()
        }


    }

    private fun playAudio() {
        val audioUrl = "https://www.bensound.com/royalty-free-music/track/ukulele"
        mediaPlayer = MediaPlayer()
        mediaPlayer!!.setAudioStreamType(AudioManager.STREAM_MUSIC)

        try {
            mediaPlayer!!.setDataSource(audioUrl)
            mediaPlayer!!.prepare()
            mediaPlayer!!.start()
        }catch (e : Exception){
            e.printStackTrace()
        }
        Toast.makeText(this, "Audio started Playing", Toast.LENGTH_SHORT).show()

    }

    private fun pauseAudio() {
        if (mediaPlayer!!.isPlaying){
            mediaPlayer!!.stop()
            mediaPlayer!!.reset()
            mediaPlayer!!.release()
        }else{
            Toast.makeText(this, "Audio has not plyed", Toast.LENGTH_SHORT).show()
        }
    }
}
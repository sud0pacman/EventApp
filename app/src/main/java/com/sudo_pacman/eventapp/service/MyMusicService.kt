package com.sudo_pacman.eventapp.service

import android.annotation.SuppressLint
import android.content.Context
import android.media.MediaPlayer
import android.net.Uri
import androidx.annotation.IdRes
import com.sudo_pacman.eventapp.R
import kotlin.time.measureTimedValue

@SuppressLint("StaticFieldLeak")
object MyMusicService {
    private lateinit var musicPlayer: MediaPlayer
    private lateinit var context: Context
    fun init(context: Context) {
        this.context = context
        musicPlayer = MediaPlayer.create(context, R.raw.no_audio)  // no audio for init
    }

    fun start(@IdRes resId: Int) {
        if (musicPlayer.isPlaying) musicPlayer.stop()
        musicPlayer = MediaPlayer.create(context, resId)
        musicPlayer.start()
    }

}
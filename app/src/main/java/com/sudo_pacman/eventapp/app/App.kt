package com.sudo_pacman.eventapp.app

import android.app.Application
import com.sudo_pacman.eventapp.data.pref.MyShared
import com.sudo_pacman.eventapp.service.MyMusicService

class App : Application() {
    override fun onCreate() {
        MyShared.init(this)
        MyMusicService.init(this)

        super.onCreate()
    }
}
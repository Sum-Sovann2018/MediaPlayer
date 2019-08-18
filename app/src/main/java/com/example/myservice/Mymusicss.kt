package com.example.myservice

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class Mymusicss:Service() {
    var Play:MediaPlayer?=null
    override fun onBind(p0: Intent?): IBinder? {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return null
    }

    override fun onCreate() {
        super.onCreate()
        Play=MediaPlayer.create(this,R.raw.ss)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Play?.start()
        return super.onStartCommand(intent, flags, startId)

    }

    override fun onDestroy() {
        super.onDestroy()
        Play?.stop()
    }

}
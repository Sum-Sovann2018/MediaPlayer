package com.example.myservice

import android.content.Intent
import android.icu.lang.UCharacter.GraphemeClusterBreak.V
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun Demo(v: View){
        var i=Intent(this,Mymusicss::class.java)
        when(v.id){
            R.id.start->{
                startService(i)
            }
            R.id.stop->{
            stopService(i)
            }
            R.id.startnew->{
       startActivity(Intent(this,Main2Activity::class.java))
            }
        }
    }
}


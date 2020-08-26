package com.example.kosmos.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kosmos.R
import com.example.kosmos.chooseyoursign.view.ChooseYourSignActivity
import java.util.*

class SplashActivity : AppCompatActivity() {
    val timer = Timer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        timer.schedule(object : TimerTask() {
            override fun run() {
                jump()
            }
        }, 4000)
    }

    private fun jump() {
        timer.cancel()
        startActivity(Intent(this@SplashActivity, ChooseYourSignActivity::class.java))
        finish()
    }
}
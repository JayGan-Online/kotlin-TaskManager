package com.jay.taskmanager

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager.LayoutParams.*
import android.widget.TextView

@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val tvAppName: TextView = findViewById(R.id.tv_app_name)

        window.setFlags(
            FLAG_FULLSCREEN,
            FLAG_FULLSCREEN
        )

        val typeFace: Typeface = Typeface.createFromAsset(assets, "GreatVibes-Regular.ttf")
        tvAppName.typeface = typeFace

        Handler().postDelayed({
            startActivity(Intent(this, IntroActivity::class.java))
            finish()
        }, 2500)
    }
}
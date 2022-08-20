package com.jay.taskmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

@Suppress("DEPRECATION")
class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val btnSignUp: Button? = findViewById(R.id.btn_sign_up_intro)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        btnSignUp?.setOnClickListener{
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}
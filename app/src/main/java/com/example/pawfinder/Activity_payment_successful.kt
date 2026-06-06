// src/main/java/com/example/pawfinder/PaymentSuccessfulActivity.kt
package com.example.pawfinder

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class Activity_payment_successful : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_successful)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, Activity_home::class.java))
            finish()
        }, 2000)
    }
}
package com.example.pawfinder

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class Activity_signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        findViewById<Button>(R.id.signbut).setOnClickListener {
            // Simulate signup, navigate to home
            startActivity(Intent(this, SIngin::class.java))
        }

        findViewById<TextView>(R.id.yesLog).setOnClickListener {
            startActivity(Intent(this, SIngin::class.java))
        }
    }
}
package com.example.pawfinder

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class Activity_payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        findViewById<Button>(R.id.btn_pay).setOnClickListener {
            startActivity(Intent(this, Activity_payment_successful::class.java))
        }
    }
}
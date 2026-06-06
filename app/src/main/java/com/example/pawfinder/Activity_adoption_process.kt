// src/main/java/com/example/pawfinder/AdoptionProcessActivity.kt
package com.example.pawfinder

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class Activity_adoption_process : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adoption_process)

        findViewById<Button>(R.id.btn_pay_adoption_fee).setOnClickListener {
            // Go to payment as example
            startActivity(Intent(this, Activity_payment::class.java))
        }
        val btn_confirm : Button = findViewById(R.id.btn_pay_adoption_fee)

        btn_confirm.setOnClickListener {
            val intent = Intent(this, Activity_payment::class.java)
            startActivity(intent)
        }
    }
}
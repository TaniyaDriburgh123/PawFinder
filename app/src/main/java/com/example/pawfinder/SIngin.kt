package com.example.pawfinder

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SIngin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singin)

        val emailEditText = findViewById<EditText>(R.id.etEmail)
        val passwordEditText = findViewById<EditText>(R.id.etPassword)

        // Set up the login button click listener
        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            // Here, you should add the login validation logic, then sign the user in
            // For simplicity, we're skipping validation and moving to the profile screen.

            // After successful login, navigate to profile screen
            val intent = Intent(this, Activity_profile::class.java)
            startActivity(intent)
        }


    }
}

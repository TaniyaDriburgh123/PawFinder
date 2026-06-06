package com.example.pawfinder

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class On_Board_Screen_3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_on_board_screen3)

        // Set up the window insets for edge-to-edge
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the "Create Account" button by its ID and set a click listener
        val createAccountButton = findViewById<Button>(R.id.btn_create_account)
        createAccountButton.setOnClickListener {
            // When clicked, start the Activity_signup screen
            val intent = Intent(this, Activity_signup::class.java)
            startActivity(intent)
        }

        // Optionally, add a click listener for the "Sign In" text view (if required)
        val signInTextView = findViewById<TextView>(R.id.tv_sign_in)
        signInTextView.setOnClickListener {
            // Start SignIn activity (this can be linked to your sign-in screen)
            val intent = Intent(this, SIngin::class.java)
            startActivity(intent)
        }
    }
}

package com.example.pawfinder

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.LinearLayout
import android.widget.ImageView

class Activity_home : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Setup bottom navigation with home selected
        setupBottomNavigation(R.id.homeBtn)

        // Find the "See All" text view and set click listener
        val seeAllTextView = findViewById<TextView>(R.id.tv_see_all)
        seeAllTextView.setOnClickListener {
            val intent = Intent(this, Activity_available_pets::class.java)
            startActivity(intent)
        }

        // Find the "pet_nova_meow" LinearLayout and set click listener
        val petNovaMeowLayout = findViewById<LinearLayout>(R.id.pet_nova_meow)
        petNovaMeowLayout.setOnClickListener {
            // Start the pet details activity when the LinearLayout is clicked
            val intent = Intent(this, Activity_pet_details::class.java)
            startActivity(intent)
        }

        // Add more pet card listeners as needed
    }
}

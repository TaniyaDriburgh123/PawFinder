package com.example.pawfinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

open class BaseActivity : AppCompatActivity() {

    protected fun setupBottomNavigation(selectedItemId: Int) {
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigation.selectedItemId = selectedItemId

        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.homeBtn -> {
                    if (this !is Activity_home) {
                        startActivity(Intent(this, Activity_home::class.java))
                        finish()
                    }
                    true
                }
                R.id.favBtn -> {
                    if (this !is Activity_favourite) {
                        startActivity(Intent(this, Activity_favourite::class.java))
                        finish()
                    }
                    true
                }
                R.id.cartBtn -> {
                    if (this !is Activity_available_pets) {
                        startActivity(Intent(this, Activity_available_pets::class.java))
                        finish()
                    }
                    true
                }
                R.id.profileBtn -> {
                    if (this !is Activity_profile) {
                        startActivity(Intent(this, Activity_profile::class.java))
                        finish()
                    }
                    true
                }
                else -> false
            }
        }
    }
}

package com.example.pawfinder

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class Activity_pet_details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pet_details)

        findViewById<Button>(R.id.btn_adopt).setOnClickListener {
            startActivity(Intent(this, Activity_adoption_process::class.java))
        }
    }
}
package com.example.sleeperdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sleeperdemo.databinding.ActivityMission1Binding

class MissionActivity1 : AppCompatActivity() {
    lateinit var binding: ActivityMission1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMission1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.missionClick1.setOnClickListener {
            val intent = Intent(this@MissionActivity1, MissionActivity2::class.java)
            startActivity(intent)
        }
    }
}
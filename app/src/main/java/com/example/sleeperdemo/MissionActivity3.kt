package com.example.sleeperdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sleeperdemo.databinding.ActivityMain2Binding
import com.example.sleeperdemo.databinding.ActivityMission3Binding

class MissionActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMission3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMission3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.missionClick3.setOnClickListener {
            val intent = Intent(this@MissionActivity3, MissionActivity4
            ::class.java)
            startActivity(intent)
        }
    }
}
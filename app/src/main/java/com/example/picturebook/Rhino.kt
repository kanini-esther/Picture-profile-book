package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Rhino : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rhino)
        val next:Button=findViewById<Button>(R.id.button4)
        next.setOnClickListener {
            val intent=Intent(this,Rhino ::class.java)
            startActivity(intent)
        }

    }
}
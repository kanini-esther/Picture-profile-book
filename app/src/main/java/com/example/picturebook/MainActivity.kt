package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val next=findViewById<Button>(R.id.button3)
        next.setOnClickListener {
            val intent=Intent(this,BufalloPicture::class.java)
            startActivity(intent)

        }


    }
}
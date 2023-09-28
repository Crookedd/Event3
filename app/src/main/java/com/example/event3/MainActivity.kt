package com.example.event3

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = findViewById<EditText>(R.id.editTextText)
        val blackColor = findViewById<Button>(R.id.button_black_color)
        val redColor = findViewById<Button>(R.id.button_red_color)
        val size8sp = findViewById<Button>(R.id.button_size8sp)
        val size24sp = findViewById<Button>(R.id.button_size24sp)
        val whileBack = findViewById<Button>(R.id.button_white_back)
        val yellowBack = findViewById<Button>(R.id.button_yellow_back)

        blackColor.setOnClickListener() {
            input.setTextColor(Color.parseColor("#000000"))
        }
        redColor.setOnClickListener() {
            input.setTextColor(Color.parseColor("#FF0000"))
        }
        size8sp.setOnClickListener() {
            input.setTextSize(TypedValue.COMPLEX_UNIT_SP, 8f)
        }
        size24sp.setOnClickListener() {
            input.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24f)
        }
        whileBack.setOnClickListener() {
            input.setBackgroundColor(Color.parseColor("#FFFFFF"))
        }
        yellowBack.setOnClickListener() {
            input.setBackgroundColor(Color.parseColor("#FFFF00"))
        }







    }
}
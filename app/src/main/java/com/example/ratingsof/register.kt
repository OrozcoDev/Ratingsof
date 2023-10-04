package com.example.ratingsof

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }
    fun volverLogin(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
package com.example.ratingsof

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class appIntents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_intents)

        val textView1 = findViewById<TextView>(R.id.vista_1)
        val receivedMessage:String = intent.extras?.getString("EXTRA_MASAGGE").orEmpty()
        textView1.text = receivedMessage
    }
}
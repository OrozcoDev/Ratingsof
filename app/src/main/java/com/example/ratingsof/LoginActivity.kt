package com.example.ratingsof

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val nombre = findViewById<EditText>(R.id.username)
        val boton = findViewById<Button>(R.id.loginButton)

        boton.setOnClickListener{
            val message:String = nombre.text.toString()
            val sendMessage = Intent(this,appIntents::class.java)
            sendMessage.putExtra("EXTRA_MASAGGE", message)
            startActivity(sendMessage)

        }
    }

    fun irASecondActivity(view: View) {
        val intent = Intent(this, register::class.java)
        startActivity(intent)
    }
}
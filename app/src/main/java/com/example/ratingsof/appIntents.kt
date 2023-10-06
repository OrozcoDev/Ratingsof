package com.example.ratingsof

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class appIntents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_intents)

        val textView1 = findViewById<TextView>(R.id.vista_1)
        val receivedMessage:String = intent.extras?.getString("EXTRA_MASAGGE").orEmpty()
        textView1.text = receivedMessage
        Toast.makeText(this, "metodo Oncreate",Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(this, "metodo Oncreate",Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "metodo onResume",Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "metodo onStop",Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "metodo onPause",Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "metodo onRestart",Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "metodo onDestroy",Toast.LENGTH_LONG).show()
    }

}


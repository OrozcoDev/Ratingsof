package com.example.ratingsof

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class appIntents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_intents)

        val textView1 = findViewById<TextView>(R.id.vista_1)
        val receivedMessage:String = intent.extras?.getString("EXTRA_MASAGGE").orEmpty()
        val btnGoToButtons = findViewById<Button>(R.id.btnGoToButtons)

        textView1.text = receivedMessage
        Toast.makeText(this, "metodo Oncreate",Toast.LENGTH_LONG).show()

        btnGoToButtons.setOnClickListener{
            startActivity(Intent(this, ButtonActivity::class.java)
            )
        }

        }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_item1 ->{
                return true
            }
            R.id.menu_item2 ->{
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }



}


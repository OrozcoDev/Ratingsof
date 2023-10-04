package com.example.ratingsof

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_main)

        val animacionArriba: Animation = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba)
        val animacionAbajo: Animation = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo)


        val codeliaTextView: TextView = findViewById(R.id.codeLiaTextView)
        val logoImageView: ImageView = findViewById(R.id.logoImageView)


        codeliaTextView.startAnimation(animacionAbajo)
        logoImageView.startAnimation(animacionArriba)

        Handler().postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000) // 2000 milisegundos (2 segundos)
    }
}


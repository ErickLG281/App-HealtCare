package com.er.healtcare

import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        val Duracion: Long = 3000;


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO: PONER FULL LA PANTALLA//
        supportActionBar?.hide()
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)

        var logo = findViewById<ImageView>(R.id.ImageHealth)






    }
}
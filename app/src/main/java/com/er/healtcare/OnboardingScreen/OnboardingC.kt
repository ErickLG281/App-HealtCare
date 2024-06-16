package com.er.healtcare.OnboardingScreen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.er.healtcare.R
import com.er.healtcare.WelcomeScreen.BienvenidoScreen

class OnboardingC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding_c)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /* Todo: Para Pasr de ventana*/
        val button = findViewById<Button>(R.id.Nextbutton)
        button.setOnClickListener{
            val intent = Intent(this, BienvenidoScreen::class.java)
            startActivity(intent)
        }
    }
}
package com.er.healtcare.Login_SignUp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.er.healtcare.OnboardingScreen.OnboardingB
import com.er.healtcare.R

class SingUp_C : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sing_up_c)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /* Todo: Para Pasr de ventana*/
        val LogInbutton = findViewById<Button>(R.id.LogInNewAcountButton)
        LogInbutton.setOnClickListener{
            val intent2 = Intent(this, LogIn_B::class.java)
            startActivity(intent2)
        }
    }
}
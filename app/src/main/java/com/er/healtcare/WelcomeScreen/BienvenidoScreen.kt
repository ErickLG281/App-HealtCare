package com.er.healtcare.WelcomeScreen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.er.healtcare.Login_SignUp.LogIn_A
import com.er.healtcare.Login_SignUp.SingUp_C
import com.er.healtcare.R

class BienvenidoScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bienvenido_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /* Todo: Para Pasr de ventana*/
        val Loginbutton = findViewById<Button>(R.id.Loginbutton)
        Loginbutton.setOnClickListener{
            val intent1 = Intent(this, LogIn_A::class.java)
            startActivity(intent1)
        }

        val Singbutton = findViewById<Button>(R.id.SingButton)
        Singbutton.setOnClickListener{
            val intent2 = Intent(this,SingUp_C::class.java )
            startActivity(intent2)
        }
    }
}
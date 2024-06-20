package com.er.healtcare.Login_SignUp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.er.healtcare.R

class LogIn_A : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_log_in)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /* Todo: Para Pasr de ventana*/
        val Singbutton = findViewById<Button>(R.id.SingUpLogInABbutton)
        Singbutton.setOnClickListener{
            val intent2 = Intent(this, SingUp_C::class.java)
            startActivity(intent2)
        }

        val SetPasButton = findViewById<Button>(R.id.ForgetPasswordLoginButton)
        SetPasButton.setOnClickListener{
            val intent3 = Intent(this, SetPassword_C::class.java)
            startActivity(intent3)
        }
    }
}
package com.code.pragati.ui.signUp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.code.pragati.FellowCredentials
import com.code.pragati.R

class SignupEntrepreneur : AppCompatActivity() {

    private lateinit var continueBtn : AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_entrepreneur)

        continueBtn = findViewById(R.id.btnContinueSignEntrepreneur)

        continueBtn.setOnClickListener{
            startActivity(Intent(this, FellowCredentials::class.java))
        }

    }
}
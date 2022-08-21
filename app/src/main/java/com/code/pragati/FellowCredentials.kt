package com.code.pragati

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.cardview.widget.CardView
import com.code.pragati.ui.login.LoginOthers

class FellowCredentials : AppCompatActivity() {

    private lateinit var email : TextView
    private lateinit var instagram : ImageButton
    private lateinit var linkedIn : ImageButton
    private lateinit var social : CardView
    private lateinit var back : ImageView
    private lateinit var proceedToLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fellow_credentials)

        email = findViewById(R.id.tvContactViaMailFellow)
        instagram = findViewById(R.id.ibContactViaInstagramFellow)
        linkedIn = findViewById(R.id.ibContactViaLinkedInFellow)
        social = findViewById(R.id.cardContactViaSocialFellow)
        back = findViewById(R.id.ivBackFellow)
        proceedToLogin = findViewById(R.id.btnProceedToLoginFellow)

        back.setOnClickListener{
            onBackPressed()
        }

        instagram.setOnClickListener {
            openApp(Uri.parse("https://www.instagram.com/axtbansal/"))
        }

        social.setOnClickListener {
            openApp(Uri.parse("https://www.twitter.com/axtbansal/"))
        }

        linkedIn.setOnClickListener {
            openApp(Uri.parse("https://www.linkedin.com/in/axtbansal/"))
        }

        email.setOnClickListener {
            openApp(Uri.parse("mailto:" + email.text))
        }

        proceedToLogin.setOnClickListener {
            startActivity(Intent(this, LoginOthers::class.java))
        }

    }

    //To open a certain app on click.
    private fun openApp(uri: Uri){
        val intent =
            Intent(Intent.ACTION_VIEW, uri)
        //            intent.setPackage("com.instagram.android")
        try {
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
        }
    }
}
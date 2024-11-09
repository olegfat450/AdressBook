package com.example.adressbook

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity2 : AppCompatActivity() {

    private lateinit var surnameText: TextView
    private lateinit var nameText: TextView
    private lateinit var adressText: TextView
    private lateinit var phoneText: TextView
    private lateinit var button: Button
    private lateinit var buttonExit: Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_2)


        surnameText = findViewById(R.id.surnameText)
        nameText = findViewById(R.id.nameText)
        adressText = findViewById(R.id.adressText)
        phoneText = findViewById(R.id.phoneText)
        button = findViewById(R.id.button)
        buttonExit = findViewById(R.id.buttonExit)

            val r = intent.getSerializableExtra(Person::class.java.simpleName) as Person?

            surnameText.text = r?.surname
            nameText.text = r?.name
            phoneText.text = r?.phone
            adressText.text = r?.adress




        buttonExit.setOnClickListener { finishAffinity() }
        button.setOnClickListener { finish() }//{ startActivity(Intent(this,MainActivity::class.java))}






        }
    }

package com.example.anketakotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_surname.*

class SurnameActivity : AppCompatActivity() {
    private lateinit var onSurnameSubmitAction: View.OnClickListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_surname)
        onSurnameSubmitAction = View.OnClickListener {
            val surname = etSurname.text.toString()
            val intentSurname = Intent()
            intentSurname.putExtra("Surname", surname)
            setResult(OPEN_SURNAME, intentSurname)
            finish()
        }
        btnSurname.setOnClickListener(onSurnameSubmitAction)
    }
}


package com.example.anketakotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_age.*

class AgeActivity : AppCompatActivity() {
    private lateinit var onAgeSubmitAction: View.OnClickListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age)
        onAgeSubmitAction = View.OnClickListener {
            val age = etAge.text.toString()
            val intentAge = Intent()
            intentAge.putExtra("Age", age)
            setResult(OPEN_SURNAME, intentAge)
            finish()
        }
        btnAge.setOnClickListener(onAgeSubmitAction)
    }
}
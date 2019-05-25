package com.example.anketakotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_name.*

class NameActivity : AppCompatActivity() {
    private lateinit var onNameSubmitAction: View.OnClickListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)
        onNameSubmitAction = View.OnClickListener {
            val name = etName.text.toString()
            val intentName = Intent()
            intentName.putExtra("Name", name)
            setResult(OPEN_NAME, intentName)
            finish()
        }
        btnName.setOnClickListener(onNameSubmitAction)
    }
}


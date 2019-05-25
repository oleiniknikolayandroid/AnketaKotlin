package com.example.anketakotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    private lateinit var onOtherSubmitAction: View.OnClickListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)
        onOtherSubmitAction = View.OnClickListener {
            val other = etOther.text.toString()
            val intentOther = Intent()
            intentOther.putExtra("Other", other)
            setResult(OPEN_OTHER, intentOther)
            finish()
        }
        btnOther.setOnClickListener(onOtherSubmitAction)
    }
}


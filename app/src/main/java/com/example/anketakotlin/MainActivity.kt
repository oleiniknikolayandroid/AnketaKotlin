package com.example.anketakotlin

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.anketakotlin.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

const val OPEN_NAME = 1
const val OPEN_SURNAME = 2
const val OPEN_AGE = 3
const val OPEN_OTHER = 4
var user: User = User("name", "surname", 0, "other")

class MainActivity : AppCompatActivity() {

    private lateinit var onChangeNameAction: View.OnClickListener
    private lateinit var onChangeSurnameAction: View.OnClickListener
    private lateinit var onChangeAgeAction: View.OnClickListener
    private lateinit var onChangeOtherAction: View.OnClickListener
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            OPEN_NAME -> if (data != null) {
                var name: String = data.getStringExtra("Name")
                twMainNameValue.text = name
            }
            OPEN_SURNAME -> if (data != null) {
                var surname: String = data.getStringExtra("Surname")
                twMainSurnameValue.text = surname
            }
            OPEN_AGE -> if (data != null) {
                var age: String = data.getStringExtra("Age")
                twMainAgeValue.text = age
            }
            OPEN_OTHER -> if (data != null) {
                var other: String = data.getStringExtra("Other")
                twMainOtherValue.text = other
            }
        }
    }

    private fun setListeners() {
        twMainAgeValue.setOnClickListener(onChangeAgeAction)
        twMainNameValue.setOnClickListener(onChangeNameAction)
        twMainSurnameValue.setOnClickListener(onChangeSurnameAction)
        twMainOtherValue.setOnClickListener(onChangeOtherAction)
    }

    private fun initListeners() {
        onChangeNameAction = View.OnClickListener {
            val changeName = Intent(this, NameActivity::class.java)
            startActivityForResult(changeName, OPEN_NAME)
        }
        onChangeSurnameAction = View.OnClickListener {
            val changeSurname = Intent(this, SurnameActivity::class.java)
            startActivityForResult(changeSurname, OPEN_SURNAME)
        }
        onChangeAgeAction = View.OnClickListener {
            val changeAge = Intent(this, AgeActivity::class.java)
            startActivityForResult(changeAge, OPEN_AGE)
        }
        onChangeOtherAction = View.OnClickListener {
            val changeOther = Intent(this, OtherActivity::class.java)
            startActivityForResult(changeOther, OPEN_OTHER)
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.user = user
        initListeners()
        setListeners()


    }

}



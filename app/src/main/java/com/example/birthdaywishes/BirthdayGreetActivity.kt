package com.example.birthdaywishes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class BirthdayGreetActivity : AppCompatActivity() {
    companion object{
         const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greet)
        val birthdayGreeting = findViewById<TextView>(R.id.birthdayGreeting)
        val name= intent.getStringExtra(NAME_EXTRA)
        birthdayGreeting.text = "Happy Birthday\n$name"
    }
}
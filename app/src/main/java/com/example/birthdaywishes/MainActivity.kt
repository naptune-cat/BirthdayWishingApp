package com.example.birthdaywishes

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createBirthdayCard(view: View) {
        val nameInput= findViewById<EditText>(R.id.nameInput)
        val name = nameInput.editableText.toString()
        val intent = Intent( this, BirthdayGreetActivity::class.java )
        intent.putExtra(BirthdayGreetActivity.NAME_EXTRA,name)

        startActivity(intent)

    }
}
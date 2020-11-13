package com.example.ahappybirthdayapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createcardwish(view: View) {
        val name=enterText.editableText.toString()

        Toast.makeText(this,"name is $name",Toast.LENGTH_LONG).show()
        val intent= Intent(this,birthdaycreategreet::class.java)
        intent.putExtra(birthdaycreategreet.NAME_EXTRA,name)
        startActivity(intent)
    }
}
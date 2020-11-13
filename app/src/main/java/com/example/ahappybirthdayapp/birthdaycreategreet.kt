package com.example.ahappybirthdayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthdaycreategreet.*

class birthdaycreategreet : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdaycreategreet)

        val name =intent.getStringExtra(NAME_EXTRA)
        BirthdayGreet.text="Happy Birthday \n$name!"

    }

}
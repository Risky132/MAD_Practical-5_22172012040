package com.example.mad_practical_5_22172012040

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val browseButton:Button=findViewById(R.id.button)
        val editTextBrowser:EditText=findViewById(R.id.btext)
        browseButton.setOnClickListener {
            OpenUrl(editTextBrowser.text.toString())
        }
    }
    fun OpenUrl(url:String)
    {
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also { startActivity(it) }
    }
    fun OpenPhone(phone:String)
    {

    }
    fun OpenCalllog()
    {

    }
    fun OpenGallary()
    {

    }
    fun OpenCamera()
    {

    }
    fun OpenAlarm()
    {

    }
}
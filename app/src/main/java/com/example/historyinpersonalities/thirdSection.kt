package com.example.historyinpersonalities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class thirdSection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_section)

        var linkToError13: ImageView = findViewById(R.id.linkToError13)

        linkToError13.setOnClickListener{
            val intent = Intent(this, error::class.java)
            startActivity(intent)
        }
    }
}
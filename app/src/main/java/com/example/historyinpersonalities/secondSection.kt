package com.example.historyinpersonalities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class secondSection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_section)

        var linkToError10: ImageView = findViewById(R.id.linkToError10)
        var linkToError11: ImageView = findViewById(R.id.linkToError11)
        var linkToError12: ImageView = findViewById(R.id.linkToError12)

        linkToError10.setOnClickListener{
            val intent = Intent(this, error::class.java)
            startActivity(intent)
        }
        linkToError11.setOnClickListener{
            val intent = Intent(this, error::class.java)
            startActivity(intent)
        }
        linkToError12.setOnClickListener{
            val intent = Intent(this, error::class.java)
            startActivity(intent)
        }
    }
}
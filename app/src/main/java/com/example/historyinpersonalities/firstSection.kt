package com.example.historyinpersonalities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class firstSection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_section)

        var linkToPeten2: ImageView = findViewById(R.id.linkToError14)
        var linkToError7: ImageView = findViewById(R.id.linkToError15)
        var linkToError8: ImageView = findViewById(R.id.linkToError17)
        var linkToError9: ImageView = findViewById(R.id.linkToError16)

        linkToPeten2.setOnClickListener{
            val intent = Intent(this, peten::class.java)
            startActivity(intent)
        }
        linkToError7.setOnClickListener{
            val intent = Intent(this, error::class.java)
            startActivity(intent)
        }
        linkToError8.setOnClickListener{
            val intent = Intent(this, error::class.java)
            startActivity(intent)
        }
        linkToError9.setOnClickListener{
            val intent = Intent(this, error::class.java)
            startActivity(intent)
        }
    }
}
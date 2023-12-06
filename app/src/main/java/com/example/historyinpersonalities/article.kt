package com.example.historyinpersonalities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class article : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)

        var linkToPeten2: ImageView = findViewById(R.id.linkToPeten2)
        var linkToError7: ImageView = findViewById(R.id.linkToError7)
        var linkToError8: ImageView = findViewById(R.id.linkToError8)
        var linkToError9: ImageView = findViewById(R.id.linkToError9)
        var linkToError10: ImageView = findViewById(R.id.linkToError10)
        var linkToError11: ImageView = findViewById(R.id.linkToError11)
        var linkToError12: ImageView = findViewById(R.id.linkToError12)
        var linkToError13: ImageView = findViewById(R.id.linkToError13)

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
        linkToError13.setOnClickListener{
            val intent = Intent(this, error::class.java)
            startActivity(intent)
        }
    }
}
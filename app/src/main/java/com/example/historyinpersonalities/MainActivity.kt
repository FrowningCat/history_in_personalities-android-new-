package com.example.historyinpersonalities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var linkToCategory: TextView = findViewById(R.id.linkToCat)
        var linkToPeten: TextView = findViewById(R.id.linkToPeten)
        var linkToError1: ImageView = findViewById(R.id.linkToError1)
        var linkToError2: ImageView = findViewById(R.id.linkToError2)
        var linkToError3: ImageView = findViewById(R.id.linkToError3)
        var linkToError4: ImageView = findViewById(R.id.linkToError4)
        var linkToError5: ImageView = findViewById(R.id.linkToError5)
        var linkToError6: ImageView = findViewById(R.id.linkToError6)

        linkToPeten.setOnClickListener{
            val intent = Intent(this, peten::class.java)
            startActivity(intent)
        }
        linkToCategory.setOnClickListener{
            val intent = Intent(this, article::class.java)
            startActivity(intent)
        }
        linkToError1.setOnClickListener{
            val intent = Intent(this, error::class.java)
            startActivity(intent)
        }
        linkToError2.setOnClickListener{
            val intent = Intent(this, error::class.java)
            startActivity(intent)
        }
        linkToError3.setOnClickListener{
            val intent = Intent(this, error::class.java)
            startActivity(intent)
        }
        linkToError4.setOnClickListener{
            val intent = Intent(this, error::class.java)
            startActivity(intent)
        }
        linkToError5.setOnClickListener{
            val intent = Intent(this, error::class.java)
            startActivity(intent)
        }
        linkToError6.setOnClickListener{
            val intent = Intent(this, error::class.java)
            startActivity(intent)
        }
    }
}
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

        var linkToPeten2: ImageView = findViewById(R.id.linkToError14)
        var linkToError7: ImageView = findViewById(R.id.linkToError15)
        var linkToError8: ImageView = findViewById(R.id.linkToError17)
        var linkToError9: ImageView = findViewById(R.id.linkToError16)
        var linkToError10: ImageView = findViewById(R.id.linkToError10)
        var linkToError11: ImageView = findViewById(R.id.linkToError11)
        var linkToError12: ImageView = findViewById(R.id.linkToError12)
        var linkToError13: ImageView = findViewById(R.id.linkToError13)
        var linkToFirstSection: TextView = findViewById(R.id.linkToFirstSection)
        var linkToSecondSection: TextView = findViewById(R.id.linkToSecondSection)
        var linkToThirdSection: TextView = findViewById(R.id.linkToThirdSection)

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
        linkToFirstSection.setOnClickListener{
            val intent = Intent(this, firstSection::class.java)
            startActivity(intent)
        }
        linkToSecondSection.setOnClickListener{
            val intent = Intent(this, secondSection::class.java)
            startActivity(intent)
        }
        linkToThirdSection.setOnClickListener{
            val intent = Intent(this, thirdSection::class.java)
            startActivity(intent)
        }
    }
}
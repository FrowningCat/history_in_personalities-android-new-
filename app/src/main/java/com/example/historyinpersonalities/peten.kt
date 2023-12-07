package com.example.historyinpersonalities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.TextView

class peten : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peten)

        var textview: TextView = findViewById(R.id.textView29)

        val para ="""По окончанию первой мировой войны франция потеряла около 1,4 миллиона солдат, не меньшее число осталось калеками. Доля призванных мужчин на военную службу во Франции в возрасте 19–49 лет составила 80 %. При этом в ходе войны французская пехота лишилась 22 % своего боевого состава – молодых и здоровых мужчин, а самые большие потери, около 30 %, понесла самая молодая возрастная группа солдат 18–25 лет. Это оказало существенное влияние на демографию и желание вести новые войны. Десятая часть страны лежала в руинах. Около 150 млрд франков было потрачено на ведение войны, кроме того, в результате Октябрьской революции Франция потеряла в России половину вывезенных за границу капиталов: советское правительство отказалось признавать долги прежних правительств и возвращать сделанные во Франции займы, а капиталы, вложенные в угольную и металлургическую промышленность России, были потеряны с национализацией этой промышленности."""

        textview.text = para

        textview.movementMethod = ScrollingMovementMethod()
    }
}
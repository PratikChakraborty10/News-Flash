package com.example.newsflash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate

class SelectCategory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_category)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        supportActionBar?.hide()

        val general_news = findViewById<Button>(R.id.general_news)
        val sports_news = findViewById<Button>(R.id.sports_news)
        //val tech_news = findViewById<Button>(R.id.tech_news)
//        val business_news = findViewById<Button>(R.id.business_news)
//        val science_news = findViewById<Button>(R.id.science_news)
//        val entertainment_news = findViewById<Button>(R.id.entertainment_news)
//        val general_news = findViewById<Button>(R.id.general_news)
        val health_news = findViewById<Button>(R.id.health_news)

        general_news.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        sports_news.setOnClickListener {
            startActivity(Intent(this, SportsNewsActivity::class.java))
        }
        health_news.setOnClickListener {
            startActivity(Intent(this, HeathNewsActivity::class.java))
        }
//        tech_news.setOnClickListener {
//
//        }
//        business_news.setOnClickListener {
//
//        }
//        science_news.setOnClickListener {
//
//        }
//        entertainment_news.setOnClickListener {
//
//        }
//        general_news.setOnClickListener {
//
//        }
    }
}
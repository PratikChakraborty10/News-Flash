package com.example.newsflash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_select_category.*

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


        val userId = intent.getStringExtra("user_id")
        val emailId = intent.getStringExtra("email_id")

        tv_user_id.text = "$userId"
        tv_email_id.text = "$emailId"

        btn_signout.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            startActivity(Intent(this@SelectCategory, LoginActivity::class.java))
            finish()
        }


    }
}
package com.example.newsflash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate
import java.security.Permission

class HeathNewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heath_news)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        supportActionBar?.hide()


        val back_bt = findViewById<Button>(R.id.back_bt)
        back_bt.setOnClickListener {
            startActivity(Intent(this, SelectCategory::class.java))
            finish()
        }
    }
}
package com.example.spoon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.small_spoon).setOnClickListener(){
            val img = findViewById<ImageView>(R.id.merka)
            img.setImageResource(R.drawable.small_spoon_img)
            img.visibility = View.VISIBLE
        }

        findViewById<Button>(R.id.big_spoon).setOnClickListener(){
            val img = findViewById<ImageView>(R.id.merka)
            img.setImageResource(R.drawable.big_spoon_img)
            img.visibility = View.VISIBLE
        }

        findViewById<Button>(R.id.glass).setOnClickListener(){
            val img = findViewById<ImageView>(R.id.merka)
            img.setImageResource(R.drawable.glass_img)
            img.visibility = View.VISIBLE
        }


    }
}
package com.example.crowcounter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var counter: Int = 0
    private var counter1: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val findBall = findViewById<Button>(R.id.btn1)
        val rez = findViewById<TextView>(R.id.txt1)
        val rez3 = findViewById<TextView>(R.id.txt3)
        findBall.setOnClickListener {
           rez.text = "Я насчитал ${++counter} ворон"
            rez3.text = "Всего ${counter+counter1}"
        }
        val findBall1 = findViewById<Button>(R.id.btn2)
        val rez1 = findViewById<TextView>(R.id.txt2)
        val rez4 = findViewById<TextView>(R.id.txt3)
        findBall1.setOnClickListener {
            rez1.text = "Я насчитал ${++counter1} котов"
            rez4.text = "Всего ${counter+counter1}"
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
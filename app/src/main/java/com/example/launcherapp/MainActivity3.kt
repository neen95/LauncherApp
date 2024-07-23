package com.example.launcherapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val btnLaunchCalculator = findViewById<Button>(R.id.btnLaunchCalculator)
        val btnLaunchColorChanger = findViewById<Button>(R.id.btnLaunchColorChanger)

        btnLaunchCalculator.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_MAIN
            intent.setClassName("com.example.calculatorapp", "com.example.calculator.MainActivity")
            intent.putExtra("message", "Launching Calculator")
            startActivity(intent)
        }

        btnLaunchColorChanger.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_MAIN
            intent.setClassName("com.example.colorchangerapp", "com.example.colorchanger.MainActivity2")
            intent.putExtra("message", "Launching Color Changer")
            startActivity(intent)
        }
    }
}

package com.example.yonseiapplibrary

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        settingButton()

    }

    fun settingButton() {
        val btn_LearnUs = findViewById<Button>(R.id.btn_LearnUs)
        val btn_MySeat = findViewById<Button>(R.id.btn_MySeat)
        val btn_Ymid = findViewById<Button>(R.id.btn_Ymid)
        val btn_Attendance = findViewById<Button>(R.id.btn_Attendance)
        val btn_Laundry = findViewById<Button>(R.id.btn_Laundry)
        val btn_Yammi = findViewById<Button>(R.id.btn_Yammi)
        val btn_Delivery = findViewById<Button>(R.id.btn_Delivery)

        btn_LearnUs.setOnClickListener {

            val myIntent = packageManager.getLaunchIntentForPackage("kr.coursemos.yonseilearnus")
            if (myIntent != null) {
                startActivity(myIntent)
            } else {
                val uri = Uri.parse("https://ys.learnus.org")
                val mySecondIntent = Intent(Intent.ACTION_VIEW, uri)
                Toast.makeText(this, "LearnUs 앱을 열지 못해 브라우저로 이동합니다.", Toast.LENGTH_SHORT).show()
                startActivity(mySecondIntent)
            }
        }
        btn_MySeat.setOnClickListener {
            val myIntent = packageManager.getLaunchIntentForPackage("com.futurenuri.yonseilibrary")
            startOrToast(myIntent, "MySeat")
        }
        btn_Ymid.setOnClickListener {
            val myIntent = packageManager.getLaunchIntentForPackage("kr.ac.yonsei.idcard")
            startOrToast(myIntent, "Y-mid")
        }
        btn_Attendance.setOnClickListener {
            val myIntent = packageManager.getLaunchIntentForPackage("kr.ac.yonsei.attendance")
            startOrToast(myIntent, "전자 출결")
        }
        btn_Laundry.setOnClickListener {
            val myIntent = packageManager.getLaunchIntentForPackage("kr.ac.yonsei.laundry")
            startOrToast(myIntent, "MetaClub")
        }
        btn_Yammi.setOnClickListener {
            val myIntent = packageManager.getLaunchIntentForPackage("com.kyad.yammi")
            startOrToast(myIntent, "Yammi")
        }
        btn_Delivery.setOnClickListener {
            val myIntent = packageManager.getLaunchIntentForPackage("com.rollingstones.baedalgeek")
            startOrToast(myIntent, "배달긱")
        }
    }
    
    fun startOrToast(intent: Intent?, appName: String) {
        if (intent != null) {
            startActivity(intent)
        } else {
            Toast.makeText(this, "${appName} 앱을 열지 못했습니다.", Toast.LENGTH_SHORT).show()
        }
    }
}
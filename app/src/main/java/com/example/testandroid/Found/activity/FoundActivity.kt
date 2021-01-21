package com.example.testandroid.Found.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.accessibility.AccessibilityEvent
import android.widget.Button
import com.example.testandroid.R


class FoundActivity : AppCompatActivity() {
    private lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_found)
        btn = findViewById(R.id.btn)

        btn.setOnClickListener {
            Log.i("chg","按钮点击")
        }


    }
}
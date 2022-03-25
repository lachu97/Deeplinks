package com.example.deeplinks

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class AnotherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val action: String? = intent?.action
        val data: Uri? = intent?.data
        Log.i("MainActivity","Action = ${action}")
        Log.i("MainActivity","Data = ${data}")
    }
}
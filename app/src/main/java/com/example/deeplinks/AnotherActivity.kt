package com.example.deeplinks

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class AnotherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val action: String? = intent?.action
        val data: Uri? = intent?.data
        if(action!=null){
            data.let {
                Log.i("MainActivity","Action = ${action}")
                Log.i("MainActivity","Data = ${data}")
            }
        }
        setContent {
            Scaffold(
            modifier = Modifier
                    .fillMaxSize()) {
                Greet(data!!.path.toString() )
            }
        }
    }
}

@Composable
fun Greet(text:String) {
    Text(text = "${text}")
}
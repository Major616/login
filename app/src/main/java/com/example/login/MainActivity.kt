package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickHandler(view: View) {
       Log.i("clickHandler","Button clicked")
        var dialIntent: Intent = Intent(Intent.ACTION_DIAL)
        startActivity(dialIntent)
    }
}


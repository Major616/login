package com.example.login

import android.content.Intent
import android.net.Uri
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
        var dialIntent: Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:98765432"))  //intent= intention
        var webIntent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ndtv.com"))

        startActivity(webIntent)
    }
}


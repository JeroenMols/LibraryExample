package com.jeroenmols.libraryexample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.jeroenmols.lib.Library

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    findViewById<TextView>(R.id.greeting).text = Library.getGreeting()
  }
}
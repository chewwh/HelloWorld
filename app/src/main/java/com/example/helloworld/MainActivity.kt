package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

// : equals to extends
class MainActivity : AppCompatActivity() {

    // oncreate = main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // create the UI
        // R = resources
        setContentView(R.layout.activity_main)
        // TODO : Continue work here
        // val = value, var = variable
        // Java int x; Kotlin val x : Int
        // findViewById = link program to UI
        val buttonClickMe : Button = findViewById(R.id.buttonClickMe)
        buttonClickMe.setOnClickListener { showMessage() }
        val buttonReset : Button = findViewById(R.id.buttonReset)
        buttonReset.setOnClickListener { showReset() }
    }

    private fun showReset() {
        val textViewMessage : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText(R.string.app_name)
    }


    private fun showMessage() {
        val textViewMessage : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText(R.string.hello)
    }
}


package com.example.people_counter_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val btnclick = findViewById<Button>(R.id.countPeopleButton)
        val exitclick = findViewById<Button>(R.id.exit)
        val text = findViewById<TextView>(R.id.textView)
        text.text = "0"

        var countClicked = 0
        btnclick.setOnClickListener {
            countClicked +=1
            text.text = countClicked.toString()

            Toast.makeText(this, " Button Clicked", Toast.LENGTH_SHORT).show()
        }

        exitclick.setOnClickListener{
            exitProcess(0)
            //  System.exit(0)
        }


//        val textclick = findViewById<TextView>(R.id.textView)
//        textclick.setOnClickListener {
//            textclick.text = " fsfsfsfsfsfs "
//        }







    }
}
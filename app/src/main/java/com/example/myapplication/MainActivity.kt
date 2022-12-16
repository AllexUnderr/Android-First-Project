package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import password.Password

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val passTextView: TextView = findViewById(R.id.pass)
//        passTextView.text = Password().generatePass(8)

        val passLength: TextView = findViewById(R.id.pass_length_value)
        val passLengthSeekBar: SeekBar = findViewById(R.id.pass_length_seekbar)

        passLengthSeekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                val lengthOfPass = passLengthSeekBar.progress
                passLength.text = lengthOfPass.toString()
//                passTextView.text = Password().generatePass(lengthOfPass)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}

            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })
    }
}
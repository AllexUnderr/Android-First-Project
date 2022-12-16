package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import com.example.myapplication.databinding.ActivityMainBinding
import password.Password

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.passwordValueTextView.text = Password().generatePass(8)

        binding.passwordLengthSeekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                val lengthOfPass = binding.passwordLengthSeekBar.progress
                binding.passwordLengthValueTextView.text = lengthOfPass.toString()
                binding.passwordValueTextView.text = Password().generatePass(lengthOfPass)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}

            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })
    }
}
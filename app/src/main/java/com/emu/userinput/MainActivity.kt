package com.emu.userinput

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.emu.userinput.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nameTxt = binding.nameTxt
        val trackTxt = binding.trackText


        val button = binding.submitBtn
        var displayText = binding.displayTxt

        button.setOnClickListener{
            if (nameTxt.text.toString().isEmpty() && trackTxt.text.toString().isEmpty()){
                Toast.makeText(this, "Input data", Toast.LENGTH_SHORT)
            } else {
                val name = nameTxt.text.toString()
                val track = trackTxt.text.toString()
                displayText.text = "My name is $name and I'm in the $track track"
            }
        }
    }

    
}
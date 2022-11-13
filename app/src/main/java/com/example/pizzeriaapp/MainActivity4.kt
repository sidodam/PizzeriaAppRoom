package com.example.pizzeriaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pizzeriaapp.databinding.ActivityMain2Binding
import com.example.pizzeriaapp.databinding.ActivityMain4Binding
import com.example.pizzeriaapp.databinding.ActivityMain5Binding

class MainActivity4 : AppCompatActivity() {

    private lateinit var binding: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras


        if (bundle != null){

            binding.textView.text = bundle.getString("pizzaType")


        }








    }
}
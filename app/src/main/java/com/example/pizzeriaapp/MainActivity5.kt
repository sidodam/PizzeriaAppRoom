package com.example.pizzeriaapp

import android.app.ActionBar.LayoutParams
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.core.content.ContextCompat
import com.example.pizzeriaapp.databinding.ActivityMain3Binding
import com.example.pizzeriaapp.databinding.ActivityMain5Binding
import com.example.pizzeriaapp.databinding.ActivityMainBinding

class MainActivity5 : AppCompatActivity() {
    private lateinit var binding: ActivityMain5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)



        val bundle = intent.extras


        val imageView = ImageView(this)
      imageView.layoutParams = LinearLayout.LayoutParams(750 , 750) // wdith , height respectively

        imageView.setImageResource(R.mipmap.psba_foreground)

        binding.layoutt.addView(imageView)

        if (bundle != null){



        }

    }
}
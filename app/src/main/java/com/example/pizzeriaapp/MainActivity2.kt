package com.example.pizzeriaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pizzeriaapp.databinding.ActivityMain2Binding
import com.example.pizzeriaapp.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val actionBar = supportActionBar

        val bundle = intent.extras
        if (actionBar != null)
        {
            actionBar.title = "Second Activity"

            actionBar.setDisplayHomeAsUpEnabled(true)

        // rest of config is on AndroidManifest

        }


        if (bundle != null){
              binding.welcoming.text = "¡" + binding.welcoming.text.toString()   + " " +  bundle.getString("name") + "!"
        }


        binding.elegir.setOnClickListener{

            val intent = Intent(this , MainActivity3::class.java)
            startActivity(intent)

        }


//
//        binding.logOut.setOnClickListener{
//            Toast.makeText(this, "Logging out", Toast.LENGTH_SHORT).show()
//            val intent = Intent(this , MainActivity::class.java)
//            startActivity(intent)
//        }



    }
}
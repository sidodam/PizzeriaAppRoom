package com.example.pizzeriaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.pizzeriaapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


        data class ID(
            val username: String,
            val password: String,

            )

        val ids = arrayOf(
            ID(
                username = "asdf",
                password = "root"
            ),
            ID(
                username = "sido",
                password = "nido"
            )
        )



        binding.login.setOnClickListener {

            var found = false
            ids.forEach {

                if (binding.Username.text.toString() == it.username && binding.Password.text.toString() == it.password) {

                    found = true

                }

            }


            if (found) {
                Toast.makeText(this, "Logging in", Toast.LENGTH_SHORT).show()
                val bundle = Bundle()
                bundle.putString("name", binding.Username.text.toString())
                val intent = Intent(this , MainActivity2::class.java)
                intent.putExtras(bundle)
                startActivity(intent)

            } else {
                Toast.makeText(this, "Not logged in", Toast.LENGTH_SHORT).show()

            }
        }


    }
}
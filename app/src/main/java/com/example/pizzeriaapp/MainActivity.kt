package com.example.pizzeriaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.room.Room
import com.example.pizzeriaapp.data.User
import com.example.pizzeriaapp.data.UserDatabase
import com.example.pizzeriaapp.databinding.ActivityMainBinding
import android.util.Log.d
import androidx.room.RoomDatabase

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        var db = Room.databaseBuilder(
            this, UserDatabase::class.java,
            "user_database"

        ).allowMainThreadQueries().createFromAsset("user_table.db").build()

//          db.userDao().delete()

        var allUsers = db.userDao().readlAllData()


        d( "sidoo" , " ${allUsers[0].username}")


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
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtras(bundle)
                startActivity(intent)

            } else {

            }
        }


    }
}
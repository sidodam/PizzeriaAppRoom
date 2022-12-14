package com.example.pizzeriaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pizzeriaapp.databinding.ActivityMain2Binding
import com.example.pizzeriaapp.databinding.ActivityMain4Binding
import com.example.pizzeriaapp.databinding.ActivityMain5Binding
import android.util.Log
import com.example.pizzeriaapp.data.User
import com.example.pizzeriaapp.data.UserDatabase

class MainActivity4 : AppCompatActivity() {

    private lateinit var binding: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras

        var db = UserDatabase.getInstance(this)?.userDao()!!
        if (bundle != null){


            val allp= db.readlAllData()
            binding.recycler.adapter =PizzAdapter(allp)



                binding.textView.text  = "TOTAL:" + (  bundle.getString("pizzaPapi").toString().toInt() * 8 +     bundle.getString("pizzaCuatro").toString().toInt() * 8 +

                        bundle.getString("pizzaMozzarella").toString().toInt() * 8
                        ).toString()       + "€"



        }




       binding.pagaYa.setOnClickListener{

            val total = bundle?.getString("pizzaPapi").toString().toInt() * 8 + bundle?.getString("pizzaCuatro").toString().toInt() * 8 +  bundle?.getString("pizzaMozzarella").toString().toInt() * 8

             val ps =  bundle?.getString("pizzaPapi").toString()
             val pm =  bundle?.getString("pizzaCuatro").toString()
             val pb = bundle?.getString("pizzaMozzarella").toString()

           bundle?.getString("pizzaMozzarella").toString().toInt() * 8

           Log.d("sidoo" , db.readlAllData().size.toString())

           db.addUser(User(0 ,"sido" , "nido" ,ps , pm , pb , total) )


       }



    }
}
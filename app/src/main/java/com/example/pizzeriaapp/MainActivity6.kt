package com.example.pizzeriaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pizzeriaapp.data.UserDatabase
import com.example.pizzeriaapp.databinding.ActivityMain2Binding
import com.example.pizzeriaapp.databinding.ActivityMain4Binding
import com.example.pizzeriaapp.databinding.ActivityMain6Binding

class MainActivity6 : AppCompatActivity() {
    private lateinit var binding: ActivityMain6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain6Binding.inflate(layoutInflater)
        setContentView(binding.root)

//
//        val ps =  bundle?.getString("pizzaPapi").toString()
//        val pm =  bundle?.getString("pizzaCuatro").toString()
//        val pb = bundle?.getString("pizzaMozzarella").toString()


        val strBuilder = StringBuilder()
        val strBuilder2 = StringBuilder()

        var db = UserDatabase.getInstance(this)?.userDao()!!





        strBuilder.appendLine("1)" + "numero de pizza papi" + " " +   db.getUser().pizza_small)
        strBuilder.appendLine("2)" + "Numero de Pizzas cuatro queso" +  " " +  db.getUser().pizza_medium)
        strBuilder.appendLine("3)" + "Numero de Pizzas Mozzarella" + " " +  db.getUser().pizza_small)
        binding.textView5.text  = strBuilder

        strBuilder2.appendLine("Pizza Peperoni")
        strBuilder2.appendLine("Pizza Cuatro Queso")
        strBuilder2.appendLine("Pizza Mozzarella")
        binding.textView6.text = strBuilder2

        binding.textView.text  = "TOTAL:" +   db.getUser().totalPedido.toString()  + "€"

    }
}
package com.example.pizzeriaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

            val strBuilder = StringBuilder()
            val strBuilder2 = StringBuilder()


            if (bundle.getString("pizzaSize") != null &&  bundle.getString("pizzaType") != null && bundle.getString("total") !=null )
            {

                strBuilder.appendLine("1." + bundle.getString("pizzaSize"))
                strBuilder.appendLine("2." + "Numero de Pizzas: 1")

                binding.textView6.text = bundle.getString("pizzaType")
                binding.textView5.text  = strBuilder
                binding.textView.text  = "TOTAL:" +  bundle.getString("total") + "€"

            }


            else if (bundle !=null)
            {

                strBuilder.appendLine("1)" + "numero de pizza papi" + " " +   bundle.getString("pizzaPapi"))
                strBuilder.appendLine("2)" + "Numero de Pizzas cuatro queso" +  " " +  bundle.getString("pizzaCuatro"))
                strBuilder.appendLine("3)" + "Numero de Pizzas Mozzarella" + " " +  bundle.getString("pizzaMozzarella"))
                binding.textView5.text  = strBuilder

                strBuilder2.appendLine("Pizza Peperoni")
                strBuilder2.appendLine("Pizza Cuatro Queso")
                strBuilder2.appendLine("Pizza Mozzarella")
                binding.textView6.text = strBuilder2

                binding.textView.text  = "TOTAL:" + (  bundle.getString("pizzaPapi").toString().toInt() * 8 +     bundle.getString("pizzaCuatro").toString().toInt() * 8 +

                        bundle.getString("pizzaMozzarella").toString().toInt() * 8
                        ).toString()       + "€"

            }












        }








    }
}
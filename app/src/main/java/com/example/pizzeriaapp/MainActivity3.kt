package com.example.pizzeriaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import com.example.pizzeriaapp.databinding.ActivityMain2Binding
import com.example.pizzeriaapp.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var paperoniPizza = 0
        var cuatroqeusoPizza = 0
        var mozzarellaiPizza = 0


            binding.btnPaperoni.setOnClickListener{

                var message = "";

                 if (binding.big2.isChecked)
                 {    message = "added one big paperoni , total is " + paperoniPizza
                     paperoniPizza++;
                 }

               else if (binding.medium2.isChecked)
                {    message = "added one medium paperoni , total is " + paperoniPizza
                    paperoniPizza++;
                }

                 else if (binding.small2.isChecked)
                 {    message = "added one small paperoni , total is " + paperoniPizza
                     paperoniPizza++;
                 }
                else{

                     Toast.makeText(this, "select size please!", Toast.LENGTH_SHORT).show()
                }


                 if (message.length!= -1)
                 {

                     Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
                 }

            }


        binding.btnCuatroqueso.setOnClickListener{

            var message = "";

            if (binding.big.isChecked)
            {    message = "added one big quatro queso , total is " + cuatroqeusoPizza
                cuatroqeusoPizza++;
            }

            else if (binding.medium.isChecked)
            {    message = "added one medium quatro queso , total is " + cuatroqeusoPizza
                cuatroqeusoPizza++;
            }

            else if (binding.small.isChecked)
            {    message = "added one small quatro queso , total is " + cuatroqeusoPizza
                cuatroqeusoPizza++;
            }
            else{

                Toast.makeText(this, "select size please!", Toast.LENGTH_SHORT).show()
            }


            if (message.length!= -1)
            {

                Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
            }

        }



        binding.btnMozzarella.setOnClickListener{

            var message = "";

            if (binding.big2.isChecked)
            {    message = "added one big mozzarella , total is " + mozzarellaiPizza
                mozzarellaiPizza++;
            }

            else if (binding.medium2.isChecked)
            {    message = "added one medium mozzarella , total is " + mozzarellaiPizza
                mozzarellaiPizza++;
            }

            else if (binding.small2.isChecked)
            {    message = "added one small mozzarella , total is " + mozzarellaiPizza
                mozzarellaiPizza++;
            }
            else{

                Toast.makeText(this, "select size please!", Toast.LENGTH_SHORT).show()
            }


            if (message.length!= -1)
            {

                Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
            }

        }




    }


    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                binding.big2.id ->
                    if (checked) {
                        binding.imageView9.layoutParams.height = 300;
                        binding.imageView9.layoutParams.height = 300;
                        binding.imageView9.requestLayout()
                    }

                binding.medium2.id ->
                    if (checked) {
                        binding.imageView9.layoutParams.height = 200;
                        binding.imageView9.layoutParams.height = 200;
                        binding.imageView9.requestLayout()
                    }

                binding.small2.id ->
                    if (checked) {
                        binding.imageView9.layoutParams.height = 150;
                        binding.imageView9.layoutParams.height = 150;
                        binding.imageView9.requestLayout()
                    }


                binding.big.id ->
                       if (checked) {
                        binding.imageView5.layoutParams.height = 300;
                        binding.imageView5.layoutParams.height = 300;
                        binding.imageView5.requestLayout()
                    }

                binding.medium.id ->
                    if (checked) {
                        binding.imageView5.layoutParams.height = 200;
                        binding.imageView5.layoutParams.height = 200;
                        binding.imageView5.requestLayout()
                    }

                binding.small.id ->
                    if (checked) {
                        binding.imageView5.layoutParams.height = 150;
                        binding.imageView5.layoutParams.height = 150;
                        binding.imageView5.requestLayout()
                    }


                binding.big3.id ->
                    if (checked) {
                        binding.imageView6.layoutParams.height = 300;
                        binding.imageView6.layoutParams.height = 300;
                        binding.imageView6.requestLayout()
                    }

                binding.medium3.id ->
                    if (checked) {
                        binding.imageView6.layoutParams.height = 200;
                        binding.imageView6.layoutParams.height = 200;
                        binding.imageView6.requestLayout()
                    }

                binding.small3.id ->
                    if (checked) {
                        binding.imageView6.layoutParams.height = 150;
                        binding.imageView6.layoutParams.height = 150;
                        binding.imageView6.requestLayout()
                    }

            }
        }

    }
}
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
        val bundle = intent.extras



        var paperoniPizza = 1
        var cuatroqeusoPizza = 1
        var mozzarellaiPizza = 1


            binding.btnPaperoni.setOnClickListener{

                var message = "";

                 if (binding.big2.isChecked)
                 {    message = "added one big paperoni , total is " + paperoniPizza
                     Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
                     paperoniPizza++;
                 }

               else if (binding.medium2.isChecked)
                {    message = "added one medium paperoni , total is " + paperoniPizza
                    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

                    paperoniPizza++;
                }

                 else if (binding.small2.isChecked)
                 {    message = "added one small paperoni , total is " + paperoniPizza
                     Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

                     paperoniPizza++;
                 }
                else{

                     Toast.makeText(this, "select size please!", Toast.LENGTH_SHORT).show()
                }




            }


        binding.btnCuatroqueso.setOnClickListener{

            var message = "";

            if (binding.big.isChecked)
            {    message = "added one big quatro queso , total is " + cuatroqeusoPizza
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

                cuatroqeusoPizza++;
            }

            else if (binding.medium.isChecked)
            {    message = "added one medium quatro queso , total is " + cuatroqeusoPizza
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

                cuatroqeusoPizza++;
            }

            else if (binding.small.isChecked)
            {    message = "added one small quatro queso , total is " + cuatroqeusoPizza
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

                cuatroqeusoPizza++;
            }
            else{

                Toast.makeText(this, "select size please!", Toast.LENGTH_SHORT).show()
            }




        }



        binding.btnMozzarella.setOnClickListener{

            var message = "";

            if (binding.big2.isChecked)
            {    message = "added one big mozzarella , total is " + mozzarellaiPizza
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

                mozzarellaiPizza++;
            }

            else if (binding.medium2.isChecked)
            {    message = "added one medium mozzarella , total is " + mozzarellaiPizza
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

                mozzarellaiPizza++;
            }

            else if (binding.small2.isChecked)
            {    message = "added one small mozzarella , total is " + mozzarellaiPizza
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

                mozzarellaiPizza++;
            }
            else{

                Toast.makeText(this, "select size please!", Toast.LENGTH_SHORT).show()
            }


        }

        binding.imagePaperoni.setOnLongClickListener {

            val bundle = Bundle()
            bundle.putInt("pizza", binding.imagePaperoni.id)
            bundle.putString("pizzaType", "Paperoni")
            val intent = Intent(this , MainActivity5::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
            true
        }


        binding.imageMozzarella.setOnLongClickListener {

            val bundle = Bundle()
            bundle.putInt("pizza", binding.imageMozzarella.id)
            bundle.putString("pizzaType", "Mozzarella")
            val intent = Intent(this , MainActivity5::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
            true
        }

        binding.imageCuatroQuesos.setOnLongClickListener {

            val bundle = Bundle()
            bundle.putInt("pizza", binding.imageCuatroQuesos.id)
            bundle.putString("pizzaType", "CuatroQuesos")
            val intent = Intent(this , MainActivity5::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
            true
        }


        binding.goToCart.setOnClickListener{


            val bundle = Bundle()
            bundle.putString("pizzaPapi", paperoniPizza.toString())
            bundle.putString("pizzaCuatro", cuatroqeusoPizza.toString())
            bundle.putString("pizzaMozzarella", mozzarellaiPizza.toString())

            val intent = Intent(this , MainActivity4::class.java)
            intent.putExtras(bundle)
            startActivity(intent)


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
                        binding.imagePaperoni.layoutParams.height = 300;
                        binding.imagePaperoni.layoutParams.height = 300;
                        binding.imagePaperoni.requestLayout()
                    }

                binding.medium2.id ->
                    if (checked) {
                        binding.imagePaperoni.layoutParams.height = 200;
                        binding.imagePaperoni.layoutParams.height = 200;
                        binding.imagePaperoni.requestLayout()
                    }

                binding.small2.id ->
                    if (checked) {
                        binding.imagePaperoni.layoutParams.height = 150;
                        binding.imagePaperoni.layoutParams.height = 150;
                        binding.imagePaperoni.requestLayout()
                    }


                binding.big.id ->
                       if (checked) {
                        binding.imageCuatroQuesos.layoutParams.height = 300;
                        binding.imageCuatroQuesos.layoutParams.height = 300;
                        binding.imageCuatroQuesos.requestLayout()
                    }

                binding.medium.id ->
                    if (checked) {
                        binding.imageCuatroQuesos.layoutParams.height = 200;
                        binding.imageCuatroQuesos.layoutParams.height = 200;
                        binding.imageCuatroQuesos.requestLayout()
                    }

                binding.small.id ->
                    if (checked) {
                        binding.imageCuatroQuesos.layoutParams.height = 150;
                        binding.imageCuatroQuesos.layoutParams.height = 150;
                        binding.imageCuatroQuesos.requestLayout()
                    }


                binding.big3.id ->
                    if (checked) {
                        binding.imageMozzarella.layoutParams.height = 300;
                        binding.imageMozzarella.layoutParams.height = 300;
                        binding.imageMozzarella.requestLayout()
                    }

                binding.medium3.id ->
                    if (checked) {
                        binding.imageMozzarella.layoutParams.height = 200;
                        binding.imageMozzarella.layoutParams.height = 200;
                        binding.imageMozzarella.requestLayout()
                    }

                binding.small3.id ->
                    if (checked) {
                        binding.imageMozzarella.layoutParams.height = 150;
                        binding.imageMozzarella.layoutParams.height = 150;
                        binding.imageMozzarella.requestLayout()
                    }

            }
        }

    }
}




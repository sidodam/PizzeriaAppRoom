package com.example.pizzeriaapp

import android.app.ActionBar.LayoutParams
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.*
import androidx.constraintlayout.widget.ConstraintSet
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.core.content.ContextCompat
import com.example.pizzeriaapp.databinding.ActivityMain3Binding
import com.example.pizzeriaapp.databinding.ActivityMain5Binding
import com.example.pizzeriaapp.databinding.ActivityMainBinding

class MainActivity5 : AppCompatActivity() {
    var FinalPrice = 0


    private lateinit var binding: ActivityMain5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val bundle = intent.extras




        binding.masQueso.setEnabled(false)
        binding.masPaperoni.setEnabled(false)
        binding.menosPaperoni.setEnabled(false)
        binding.menosQueso.setEnabled(false)



        val imageView = ImageView(this)
        imageView.layoutParams = LinearLayout.LayoutParams(750, 750) // wdith , height respectively

        if (bundle != null){


            if ( bundle.getString("pizzaType") == "Paperoni")
            {
                imageView.setImageResource(R.mipmap.psep_foreground)


            }


            if ( bundle.getString("pizzaType") == "Mozzarella")
            {

                imageView.setImageResource(R.mipmap.pscar_foreground)

            }

            if ( bundle.getString("pizzaType") == "CuatroQuesos")
            {

                imageView.setImageResource(R.mipmap.psba_foreground)


            }
        }



        binding.masPaperoni.setOnClickListener{





            FinalPrice +=  2

            binding.paperoniCont.text = (binding.paperoniCont.text.toString().toInt() + 1).toString()
            binding.priceTotal.text = "TOTAL: " +  FinalPrice.toString() + "€"

        }

        binding.masQueso.setOnClickListener{
            FinalPrice +=  2
            binding.quesoCont.text = (binding.quesoCont.text.toString().toInt() + 1).toString()

            binding.priceTotal.text = "TOTAL: " +  FinalPrice.toString() + "€"

        }

        binding.menosPaperoni.setOnClickListener{
            FinalPrice -=  2
            if (binding.paperoniCont.text.toString().toInt() > 0)
            {
                binding.paperoniCont.text = (binding.paperoniCont.text.toString().toInt() - 1).toString()
                binding.priceTotal.text = "TOTAL: " +  FinalPrice.toString() + "€"
            }



        }

        binding.menosQueso.setOnClickListener{

            FinalPrice -=  2
            if (binding.quesoCont.text.toString().toInt() > 0)
            {
                binding.quesoCont.text = (binding.quesoCont.text.toString().toInt() - 1).toString()
                binding.priceTotal.text = "TOTAL: " +  FinalPrice.toString() + "€"
            }



        }



        // so that user dont spam click minus button when extra peperoni and queso is 0

        binding.paperoniCont.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {

                if (binding.paperoniCont.text.toString() == "0")
                {
                    binding.menosPaperoni.setEnabled(false)
                    binding.menosQueso.setEnabled(false)

                }
                else{
                    binding.menosPaperoni.setEnabled(true)
                    binding.menosQueso.setEnabled(true)

                }


            }
        })


        binding.quesoCont.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {

                if (binding.quesoCont.text.toString() == "0")
                {
                    binding.menosPaperoni.setEnabled(false)
                    binding.menosQueso.setEnabled(false)

                }
                else{
                    binding.menosPaperoni.setEnabled(true)
                    binding.menosQueso.setEnabled(true)
                }


            }
        })


        binding.cartBtn.setOnClickListener {
            if (binding.bigSize.isChecked || binding.mediumSize.isChecked || binding.smallSize.isChecked)
            {
                     var chosenSize = ""

                if (binding.bigSize.isChecked)  chosenSize = "Tamaño grande"
                if (binding.mediumSize.isChecked)  chosenSize = "Tamaño medio"
                if (binding.smallSize.isChecked)  chosenSize = "Tamaño pequeño"



                val bundle2 = Bundle()
                if (bundle != null) {
                    bundle2.putString("pizzaType", bundle.getString("pizzaType"))



                }
                bundle2.putString("pizzaSize", chosenSize)
                bundle2.putString("total", FinalPrice.toString() )


                val intent = Intent(this , MainActivity4::class.java)
                intent.putExtras(bundle2)
                startActivity(intent)


            }

            else{
                Toast.makeText(this, "select size please!", Toast.LENGTH_SHORT).show()

            }


        }




        binding.layoutt.addView(imageView)


    }




    fun onSizeClick(view: View) {

        if (view is RadioButton) {
            val checked = view.isChecked


            binding.masQueso.setEnabled(true)
            binding.masPaperoni.setEnabled(true)
            binding.menosPaperoni.setEnabled(true)
            binding.menosQueso.setEnabled(true)

            when (view.getId()) {
                binding.bigSize.id ->
                    if (checked) {
                        FinalPrice =  15
                        binding.paperoniCont.setText("0")
                        binding.quesoCont.setText("0")
                        binding.priceTotal.text =  "TOTAL: " +  FinalPrice.toString() + "€"
                    }


                binding.mediumSize.id ->
                    if (checked) {
                        FinalPrice =  8
                        binding.paperoniCont.setText("0")
                        binding.quesoCont.setText("0")
                        binding.priceTotal.text =  "TOTAL: " +  FinalPrice.toString() + "€"
                    }


                binding.smallSize.id ->
                    if (checked) {
                        FinalPrice = 6
                        binding.paperoniCont.setText("0")
                        binding.quesoCont.setText("0")
                        binding.priceTotal.text = "TOTAL: " +  FinalPrice.toString() + "€"
                    }


            }
        }

    }



}
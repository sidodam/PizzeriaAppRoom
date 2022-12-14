package com.example.pizzeriaapp


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.pizzeriaapp.data.User

class PizzAdapter(private val users: List<User>) :
    RecyclerView.Adapter<PizzAdapter.DicViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DicViewHolder {


        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return DicViewHolder(view)
    }

    override fun onBindViewHolder(holder: DicViewHolder, position: Int) {
        var u = users[position]

        holder.bind(u)

    }

    override fun getItemCount(): Int {
        return users.size
    }


    class DicViewHolder(view: View) : RecyclerView.ViewHolder(view) {


        var t1: TextView = view.findViewById(R.id.textFirst)
        var t2: TextView = view.findViewById(R.id.textSecond)
        var t3: TextView = view.findViewById(R.id.textThird)


        fun bind(user: User) {

           this.t1.text = "pizza Peperoni"  +  user.pizza_small
           this.t2.text = "pizza Quatro Queso"  + user.pizza_medium
            this.t3.text = "pizza Mozzarella"  + user.piiza_big

        }





    }


}


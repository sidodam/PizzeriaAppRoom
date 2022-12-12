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

class PizzAdapter(private val users: List<User>, private val mContext: Context) :
    RecyclerView.Adapter<PizzAdapter.DicViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DicViewHolder {


        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_main, parent, false)

        return DicViewHolder(view)
    }

    override fun onBindViewHolder(holder: DicViewHolder, position: Int) {
        var u = users[position]

        holder.bind(u)
        holder.onClick(mContext)

    }

    override fun getItemCount(): Int {
        return users.size
    }


    class DicViewHolder(view: View) : RecyclerView.ViewHolder(view) {


        var t1: TextView = view.findViewById(R.id.Username)
        var t2: TextView = view.findViewById(R.id.Password)
        var t3: TextView = view.findViewById(R.id.big)

        var btn: Button = view.findViewById(R.id.big)


        fun bind(u: User) {

            this.t1.text = this.t1.text.toString()
            this.t2.text = this.t2.text.toString()
            this.t3.text = this.t3.text.toString()


        }


        fun onClick(context: Context) {

            btn.setOnClickListener {


                Toast.makeText(context, "pedido aniadido", Toast.LENGTH_SHORT).show()

            }
        }


    }


}


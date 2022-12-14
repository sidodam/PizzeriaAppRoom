package com.example.pizzeriaapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id : Int ,
    val username : String,
    val password : String,
    val pizza_small: String ,
    val pizza_medium: String ,
    val piiza_big : String ,
    val totalPedido : Int = 0
)
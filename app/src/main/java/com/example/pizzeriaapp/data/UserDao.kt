package com.example.pizzeriaapp.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE) // allow new duplicate users
    fun addUser(user:User)
  @Query("SELECT * FROM user_table")
    fun readlAllData(): List<User>

    @Query("DELETE FROM user_table WHERE username='jon'")
    fun delete();
}
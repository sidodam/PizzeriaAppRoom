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
    @Query("SELECT * FROM user_table WHERE username = :title ")
    fun retrieveUser(title:String): LiveData<List<User>>
    //    @Query("UPDATE orders SET order_amount = :amount, price = :price WHERE order_id =:id")
    //    void update(Float amount, Float price, int id);
    @Query("UPDATE user_table SET  username = :user, password =:pass , pizza_small =:ps  ,pizza_medium=:pm ,piiza_big=:pb , totalPedido=:tp")
     fun  updateUser(user : String , pass:String, ps:String , pm:String , pb:String , tp:Int)
     @Query("SELECT * FROM user_table ORDER BY id DESC LIMIT 1;")
     fun  getUser():User
//

}
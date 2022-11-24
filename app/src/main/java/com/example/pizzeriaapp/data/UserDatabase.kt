package com.example.pizzeriaapp.data

import android.content.Context
import android.os.strictmode.InstanceCountViolation
import android.provider.CalendarContract.Instances
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

private const val DATABASE_NAME = "user_Database"
@Database(entities = [User::class] , version = 1 )

abstract class UserDatabase :RoomDatabase(){

    abstract fun userDao(): UserDao

//    companion object{
//        @Volatile
//        private var INSTANCE : UserDatabase?= null
//
//          fun getDatabase(context: Context) : UserDatabase{
//
//
//
//             return INSTANCE?: synchronized(Any()){
//                 INSTANCE?:buildDatabase(context).also{ INSTANCE = it}
//             }
//
//
//        }
//
//        private fun buildDatabase(context: Context): UserDatabase {
//            return Room.databaseBuilder(context.applicationContext,UserDatabase::class.java,DATABASE_NAME).build()
//
//        }
//    }
}

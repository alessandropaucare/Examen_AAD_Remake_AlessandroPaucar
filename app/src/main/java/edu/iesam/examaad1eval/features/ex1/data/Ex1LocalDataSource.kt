package edu.iesam.examaad1eval.features.ex1.data

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import edu.iesam.examaad1eval.R
import edu.iesam.examaad1eval.features.ex1.Item
import edu.iesam.examaad1eval.features.ex1.Services
import edu.iesam.examaad1eval.features.ex1.User

class Ex1LocalDataSource(
    context: Context
) {
    private val sharedPref: SharedPreferences = context.getSharedPreferences(
        context.getString(R.string.preference_file_key), Context.MODE_PRIVATE
    )
    private val gson = Gson()

    fun saveUsers(users : List<User> ){
        TODO("Not yet implemented")
    }

    fun saveItems(items : List<Item>) {
        TODO("Not yet implemented")
    }

    fun saveServices(services : List<Services>){
        TODO("Not yet implemented")
    }

    fun getUsers(): List<User> {
        TODO("Not yet implemented")
    }

    fun getItems(): List<Item> {
        TODO("Not yet implemented")
    }

    fun getServices(): List<Services> {
        TODO("Not yet implemented")
    }


}
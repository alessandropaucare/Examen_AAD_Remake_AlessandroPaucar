package edu.iesam.examaad1eval.features.ex1.data

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
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
        sharedPref.edit().putString("users",gson.toJson(users)).apply()
    }

    fun saveItems(items : List<Item>) {
        sharedPref.edit().putString("items",gson.toJson(items)).apply()
    }

    fun saveServices(services : List<Services>){
        sharedPref.edit().putString("services",gson.toJson(services)).apply()
    }

    fun getUsers(): List<User> {

        val modelJsonList = sharedPref.getString("users", null) ?: return emptyList()
        val type = object : TypeToken<List<User>>() {}.type
        return gson.fromJson(modelJsonList, type) ?: emptyList()
    }

    fun getItems(): List<Item> {
        val modelJsonList = sharedPref.getString("items", null) ?: return emptyList()
        val type = object : TypeToken<List<Item>>() {}.type
        return gson.fromJson(modelJsonList, type) ?: emptyList()
    }

    fun getServices(): List<Services> {
        val modelJsonList = sharedPref.getString("services", null) ?: return emptyList()
        val type = object : TypeToken<List<Services>>() {}.type
        return gson.fromJson(modelJsonList, type) ?: emptyList()
    }


}
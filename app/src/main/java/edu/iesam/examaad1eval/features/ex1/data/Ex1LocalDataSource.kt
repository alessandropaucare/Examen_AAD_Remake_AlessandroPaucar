package edu.iesam.examaad1eval.features.ex1.data

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import edu.iesam.examaad1eval.R

class Ex1LocalDataSource(
    context: Context
) {
    private val sharedPref :  SharedPreferences = context.getSharedPreferences(
        context.getString(R.string.preference_file_key), Context.MODE_PRIVATE
    )
    private val gson = Gson()











}
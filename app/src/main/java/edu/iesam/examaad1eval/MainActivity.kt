package edu.iesam.examaad1eval

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import edu.iesam.examaad1eval.features.ex1.data.Ex1DataRepository
import edu.iesam.examaad1eval.features.ex1.data.Ex1LocalDataSource
import edu.iesam.examaad1eval.features.ex1.data.MockEx1RemoteDataSource
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        executeExercise1()
        executeExercise2()
    }

    private fun executeExercise1(){
         val local = Ex1LocalDataSource(this)
         val remote = MockEx1RemoteDataSource()
         val dataRepository = Ex1DataRepository(local,remote)

        val users = dataRepository.getUsers()
        Log.d("@dev","Listado de usuarios")
        Log.d("@dev","$users")
        val items = dataRepository.getItems()
        Log.d("@dev","Listado de items")
        Log.d("@dev","$items")
        val services = dataRepository.getServices()
        Log.d("@dev","Listado de servicios")
        Log.d("@dev","$services")
    }

    @OptIn(DelicateCoroutinesApi::class)
    private fun executeExercise2(){
        //Ejecutar el ejercicio 2 desde aquí llamando al Ex2DataRepository directamente
        GlobalScope.launch {
            //llamar a Room
        }
    }
}
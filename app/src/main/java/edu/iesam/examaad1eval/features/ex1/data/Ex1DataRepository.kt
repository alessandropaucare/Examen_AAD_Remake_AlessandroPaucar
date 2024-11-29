package edu.iesam.examaad1eval.features.ex1.data

import edu.iesam.examaad1eval.features.ex1.Ex1Repository
import edu.iesam.examaad1eval.features.ex1.Item
import edu.iesam.examaad1eval.features.ex1.Services
import edu.iesam.examaad1eval.features.ex1.User

class Ex1DataRepository(
    private val local : Ex1LocalDataSource,
    private val remote : MockEx1RemoteDataSource
) : Ex1Repository{
    override fun getUsers(): List<User> {
        TODO("Not yet implemented")
    }

    override fun getItems(): List<Item> {
        TODO("Not yet implemented")
    }

    override fun getServices(): List<Services> {
        TODO("Not yet implemented")
    }

    override fun saveUsers(users: List<User>) {
        TODO("Not yet implemented")
    }

    override fun saveItems(items: List<Item>) {
        TODO("Not yet implemented")
    }

    override fun saveServices(services: List<Services>) {
        TODO("Not yet implemented")
    }


}
package edu.iesam.examaad1eval.features.ex1

interface Ex1Repository {
    fun getUsers(): List<User>
    fun getItems(): List<Item>
    fun getServices(): List<Services>
    fun saveUsers(users : List<User>)
    fun saveItems(items : List<Item>)
    fun saveServices(services : List<Services>)
}
package edu.iesam.examaad1eval.features.ex2.data.local

import edu.iesam.examaad1eval.features.ex2.domain.Game

class GamesDbLocalDataSource(
    private val gamesDAO: GamesDAO
) {
     fun getAll() : List<Game>{
        return gamesDAO.getAll().map { it.toDomainModel() }
    }

     fun saveAll(games : List<Game>){
        val gameEntityList = games.map { it.toEntity() }
        gamesDAO.insertAll(*gameEntityList.toTypedArray())
    }

}
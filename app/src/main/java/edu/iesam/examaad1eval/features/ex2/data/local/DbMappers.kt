package edu.iesam.examaad1eval.features.ex2.data.local

import edu.iesam.examaad1eval.features.ex2.domain.Game

fun Game.toEntity() : GamesEntity =
    GamesEntity(this.id, this.title, this.players)

fun GamesEntity.toDomainModel() : Game =
    Game(this.id, this.title, this.players)




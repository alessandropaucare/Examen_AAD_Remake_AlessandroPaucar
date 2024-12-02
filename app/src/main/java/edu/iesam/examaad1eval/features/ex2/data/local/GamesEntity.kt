package edu.iesam.examaad1eval.features.ex2.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import edu.iesam.examaad1eval.features.ex2.domain.Player

const val TABLE_NAME = "games"

@Entity(TABLE_NAME)
data class GamesEntity(
    @PrimaryKey @ColumnInfo(name = "id") val id : String,
    @ColumnInfo(name = "title") val title : String,
    @ColumnInfo(name = "players") val players: List<Player>
)
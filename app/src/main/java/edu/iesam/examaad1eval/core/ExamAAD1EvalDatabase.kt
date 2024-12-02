package edu.iesam.examaad1eval.core

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import edu.iesam.examaad1eval.features.ex2.data.local.Converters
import edu.iesam.examaad1eval.features.ex2.data.local.GamesDAO
import edu.iesam.examaad1eval.features.ex2.data.local.GamesEntity

@Database(entities = [GamesEntity::class], version = 1)
@TypeConverters(Converters::class)
abstract class ExamAAD1EvalDatabase : RoomDatabase() {
    abstract fun gamesDao(): GamesDAO
}
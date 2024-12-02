package edu.iesam.examaad1eval.features.ex2.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface GamesDAO {

    @Query("SELECT * FROM $TABLE_NAME")
    fun getAll(): List<GamesEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg games: GamesEntity)

}
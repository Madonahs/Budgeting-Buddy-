package com.madonasyombua.sportsdb.data.local.dao

import androidx.room.*
import com.madonasyombua.sportsdb.data.local.entities.MatchEntity

@Dao
interface MatchDao {
    @Query("SELECT * FROM matchentity")
    fun getAllMatches(): List<MatchEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMatchData(sportEntity: MatchEntity)

    @Delete
    fun deleteMatchData(sportEntity: MatchEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateMatchData(sportEntity: MatchEntity)
}
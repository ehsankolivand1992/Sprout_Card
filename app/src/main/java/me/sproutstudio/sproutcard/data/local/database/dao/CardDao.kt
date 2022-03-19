package me.sproutstudio.sproutcard.data.local.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import me.sproutstudio.sproutcard.data.local.entites.CardModel

@Dao
interface CardDao {
    //get all cardModel
    @Query("SELECT * FROM card_table")
    suspend fun getAllCard(): List<CardModel>

    //get cardModel by id
    @Query("SELECT * FROM card_table WHERE id = :id")
    suspend fun getCardById(id: Long): CardModel

    //get cardModel by name
    @Query("SELECT * FROM card_table WHERE name = :name")
    suspend fun getCardByName(name: String): CardModel

    // get cardModel by category
    @Query("SELECT * FROM card_table WHERE categoryId = :categoryId")
    suspend fun getCardByCategory(categoryId: Long): List<CardModel>

    //delete cardModel by id
    @Query("DELETE FROM card_table WHERE id = :id")
    suspend fun deleteCardById(id: Long)

    //delete all
    @Query("DELETE FROM card_table")
    suspend fun deleteAll()

    //insert cardModel
    @Insert
    suspend fun insertCard(cardModel: CardModel)

    //update cardModel
    @Update
    suspend fun updateCard(cardModel: CardModel)


}
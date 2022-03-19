package me.sproutstudio.sproutcard.data.local.database.dao

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import me.sproutstudio.sproutcard.data.local.entites.CardCategoryModel
import me.sproutstudio.sproutcard.data.local.entites.relations.CardWithCategory


@Dao
interface CardCategoryDao {

    @Query("SELECT * FROM card_category")
     fun getAll(): Flow<List<CardCategoryModel>>

    @Query("SELECT * FROM card_category WHERE id = :id")
     fun getById(id: Int): CardCategoryModel

     @Insert
     fun insert(cardCategory: CardCategoryModel)

     @Query("DELETE FROM card_category")
     fun deleteAll()

     @Query("DELETE FROM card_category WHERE id = :id")
     fun deleteById(id: Int)

     @Update
     fun update(cardCategory: CardCategoryModel)

     @Transaction
     @Query("SELECT * FROM card_category WHERE id = :id")
     fun getByIdWithCards(id: Int): CardWithCategory


}
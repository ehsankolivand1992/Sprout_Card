package me.sproutstudio.sproutcard.data.local.database.dao

import androidx.room.*
import me.sproutstudio.sproutcard.data.local.entites.User
import me.sproutstudio.sproutcard.data.local.entites.relations.UserWithCards
import me.sproutstudio.sproutcard.data.local.entites.relations.UserWithCategory

@Dao
interface UserDao {
    //get all user
    @Query("SELECT * FROM users")
    suspend fun getAll(): List<User>

    //add user
    @Insert
    suspend fun addUser(user: User)

    //update user
    @Update
    suspend fun updateUser(user: User)

    //delete user
    @Query("DELETE FROM users WHERE id = :id")
    suspend fun deleteUser(id: Long)

    //get user Card with category
    @Transaction
    @Query("SELECT * FROM users WHERE id = :id")
    suspend fun getUserCategory(id: Long): UserWithCategory

    @Transaction
    @Query("SELECT * FROM users WHERE id = :id")
    suspend fun getUserCards(id: Long): UserWithCards


}
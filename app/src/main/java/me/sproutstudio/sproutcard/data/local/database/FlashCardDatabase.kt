package me.sproutstudio.sproutcard.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import me.sproutstudio.sproutcard.data.local.database.dao.CardCategoryDao
import me.sproutstudio.sproutcard.data.local.database.dao.CardDao
import me.sproutstudio.sproutcard.data.local.database.dao.UserDao
import me.sproutstudio.sproutcard.data.local.entites.CardCategoryModel
import me.sproutstudio.sproutcard.data.local.entites.CardModel
import me.sproutstudio.sproutcard.data.local.entites.User


@Database(entities = [User::class,CardCategoryModel::class,CardModel::class], version = 1)
abstract class FlashCardDatabase: RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun cardCategoryDao(): CardCategoryDao
    abstract fun cardDao(): CardDao
}

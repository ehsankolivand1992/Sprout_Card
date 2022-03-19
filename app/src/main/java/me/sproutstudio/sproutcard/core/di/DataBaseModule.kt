package me.sproutstudio.sproutcard.core.di

import android.content.Context
import androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion.instance
import androidx.room.Room
import androidx.room.RoomDatabase
import me.sproutstudio.sproutcard.core.App
import me.sproutstudio.sproutcard.data.local.database.FlashCardDatabase


    //provide room database
    fun provideRoomDatabase(context: Context): RoomDatabase {
        return Room.databaseBuilder(
            context,
            FlashCardDatabase::class.java,
            "sproutcard.db"
        ).build()
    }
val appModule = module {

}


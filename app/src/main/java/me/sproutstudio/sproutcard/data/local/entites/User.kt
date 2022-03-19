package me.sproutstudio.sproutcard.data.local.entites

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id:Long,
    val name:String,
    val email:String,
    val password:String,
    val phone:String,
    val photo:String,
    val createdAt:String,
    val updatedAt:String
)

package me.sproutstudio.sproutcard.data.local.entites

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "card_table")
data class CardModel(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val question: String,
    val answer: String,
    val photo: String,
    val voice: String,
    val difficulty: String,
    val type: String,
    val categoryId: Long,
    val userId: Long,
    val createdAt: Long,
    val updatedAt: Long
)


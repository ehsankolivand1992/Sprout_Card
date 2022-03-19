package me.sproutstudio.sproutcard.data.local.entites

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(
    tableName = "card_category")
data class CardCategoryModel(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val name: String,
    val color: Int,
    val userId: Long,
    val createdAt: Long,
    val updatedAt: Long
)

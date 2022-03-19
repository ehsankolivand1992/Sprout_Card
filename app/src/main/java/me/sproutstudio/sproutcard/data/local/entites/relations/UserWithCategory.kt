package me.sproutstudio.sproutcard.data.local.entites.relations

import androidx.room.Embedded
import androidx.room.Relation
import me.sproutstudio.sproutcard.data.local.entites.CardCategoryModel
import me.sproutstudio.sproutcard.data.local.entites.User


data class UserWithCategory(
    @Embedded
    val user: User,
    @Relation(
        parentColumn = "id",
        entityColumn = "userId"
    )
    val categories: List<CardCategoryModel>
)

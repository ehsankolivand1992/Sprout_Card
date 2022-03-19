package me.sproutstudio.sproutcard.data.local.entites.relations

import androidx.room.Embedded
import androidx.room.Relation
import me.sproutstudio.sproutcard.data.local.entites.CardModel
import me.sproutstudio.sproutcard.data.local.entites.User

data class UserWithCards(
    @Embedded
    val user: User,
    @Relation(
        parentColumn = "id",
        entityColumn = "userId"
    )
    val cards: List<CardModel>
)

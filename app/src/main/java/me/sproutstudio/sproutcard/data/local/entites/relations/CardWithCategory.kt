package me.sproutstudio.sproutcard.data.local.entites.relations

import androidx.room.Embedded
import androidx.room.Relation
import me.sproutstudio.sproutcard.data.local.entites.CardCategoryModel
import me.sproutstudio.sproutcard.data.local.entites.CardModel


data class CardWithCategory(
    @Embedded
    val categoryModel: CardCategoryModel,
    @Relation(
        parentColumn = "id",
        entityColumn = "categoryId"
    )
    val cardModel: List<CardModel>
)

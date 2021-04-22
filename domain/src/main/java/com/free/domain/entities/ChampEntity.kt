package com.free.domain.entities

data class ChampsListEntity(val listChamps: List<Champ>) {
    data class Champ(
        val id: Int,
        val name: String,
        val imgUrl: String,
        val cost: Int
    )
}
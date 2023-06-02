package com.example.danp2023room.entities

import androidx.room.Entity

@Entity(primaryKeys = ["studentId","unitId"])
data class StudentWithUnitCrossRef(
    val studentId: Int,
    val unitId:Int
)

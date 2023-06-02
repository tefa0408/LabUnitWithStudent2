package com.example.danp2023room.model

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.example.danp2023room.entities.StudentWithUnit
import com.example.danp2023room.entities.UnitEntity

@Dao
interface UnitDao {

    @Transaction
    @Query("select * from unit")
    suspend fun getStudentWithUnit(): List<StudentWithUnit>
}
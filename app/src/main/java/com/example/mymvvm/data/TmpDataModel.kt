package com.example.mymvvm.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tmp")
data class TmpDataModel(
    @PrimaryKey
    var Id : Long = 1234L,
    var name : String = ""
)
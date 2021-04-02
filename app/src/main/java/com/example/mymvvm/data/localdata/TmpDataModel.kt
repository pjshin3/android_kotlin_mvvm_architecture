package com.example.mymvvm.data.localdata

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tmp")
data class TmpDataModel(
    @PrimaryKey
    var id : Long = 1234L,
    var name : String = ""
)
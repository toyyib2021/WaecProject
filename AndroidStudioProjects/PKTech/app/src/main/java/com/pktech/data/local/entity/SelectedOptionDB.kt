package com.pktech.data.local.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.pktech.utill.Constants.SELECTED_OPTION_TABLE

@Entity(tableName = SELECTED_OPTION_TABLE )
data class SelectedOptionDB (
    @PrimaryKey(autoGenerate = true)
    @NonNull
    var id: Int = 0,
    @ColumnInfo(name = "options") var selectedOption: String
        )
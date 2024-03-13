package com.example.imoney.common

import android.net.Uri
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "schedule_main_table")
data class ScheduleModule(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    val id: Int,
    @ColumnInfo(name = "_startTime")
    var startTime: ScheduleTimeModule = ScheduleTimeModule(),
    @ColumnInfo(name = "_duringTime")
    var duringTime: Int,
    @ColumnInfo(name = "_title")
    var title: String = "",
    @ColumnInfo(name = "_icon")
    var icon: Int = 0,
    var frequency: FrequencySchedule = FrequencySchedule.Once
)
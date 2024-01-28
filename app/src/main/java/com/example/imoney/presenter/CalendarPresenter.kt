package com.example.imoney.presenter

import com.example.imoney.untils.DateUntils
import java.util.Date

class CalendarPresenter {
    val listDates = mutableListOf<Date>()
    private var selectedDay = DateUntils.getToday()
    fun getDateFromMonthAndYear(month: String, year: String, checkOnlyYear: Boolean): List<Date> {
        listDates.clear()
        val monthInt = convertMonthToInt(month)
        try {
            var yearInt = year.toInt()
            if(checkOnlyYear) yearInt++
            listDates.addAll(DateUntils.getDateOfMonth(monthInt, yearInt))
        } catch (error: NumberFormatException){

        }
        return listDates
    }

    private fun convertMonthToInt(month: String): Int {
        when (month) {
            "January" -> return 1
            "February" -> return 2
            "March" -> return 3
            "April" -> return 4
            "May" -> return 5
            "June" -> return 6
            "July" -> return 7
            "August" -> return 8
            "September" -> return 9
            "October" -> return 10
            "November" -> return 11
        }
        return 12
    }

    fun onSelectedDay(pos: Int) {
        //list date always has pos date because the calendar currently show has pos and we just have chosen the date in current calendar
        selectedDay = listDates[pos]
    }
}

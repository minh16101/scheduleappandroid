package com.example.imoney.presenter

import com.example.imoney.untils.DateUntils
import java.util.Date

class CalendarPresenter {
    val listDates = mutableListOf<Date>()
    fun getDateFromMonthAndYear(month: String, year: String): List<Date> {
        val monthInt = convertMonthToInt(month)
        try {
            val yearInt = year.toInt()
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
}
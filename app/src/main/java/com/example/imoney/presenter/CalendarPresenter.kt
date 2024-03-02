package com.example.imoney.presenter

import com.example.imoney.untils.DateUntils
import java.util.Calendar
import java.util.Date

class CalendarPresenter {
    val listDates = mutableListOf<Date>()
    var currentMonth = 0
    var currentYear = 0
    private var selectedDay = DateUntils.getToday()
    fun getDateFromMonthAndYear(monthInt: Int, yearInt: Int, checkOnlyYear: Boolean): List<Date> {
        listDates.clear()
        try {
            var year = yearInt
            if (checkOnlyYear) year++
            listDates.addAll(DateUntils.getDateOfMonth(monthInt, year))
        } catch (error: NumberFormatException) {

        }
        return listDates
    }

    fun setStartTimeForCalendar() {
        val today = DateUntils.getToday()
        val month = today.get(Calendar.MONTH)
        val year = today.get(Calendar.YEAR)
        currentMonth = month
        currentYear = year
    }

    private fun convertMonthToInt(month: String): Int {
        when (month) {
            "January" -> return 0
            "February" -> return 1
            "March" -> return 2
            "April" -> return 3
            "May" -> return 4
            "June" -> return 5
            "July" -> return 6
            "August" -> return 7
            "September" -> return 8
            "October" -> return 9
            "November" -> return 10
        }
        return 11
    }

    fun onSelectedDay(pos: Int) {
        //list date always has pos date because the calendar currently show has pos and we just have chosen the date in current calendar
        selectedDay.time = listDates[pos]
    }
}

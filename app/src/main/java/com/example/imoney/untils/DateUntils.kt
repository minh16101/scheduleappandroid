package com.example.imoney.untils

import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
object DateUntils {
    fun getDateOfMonth(month: Int, year: Int): List<Date>{
        val listDates = mutableListOf<Date>()
        val listPreDates = mutableListOf<Date>()
        val listNextDates = mutableListOf<Date>()
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.MONTH, month - 1)
        calendar.set(Calendar.YEAR, year)
        //get all day of current month
        val maxDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH)
        var firstDayOfMonth: Date = Date()
        var lastDayOfMonth: Date = Date()
        for(i in 1..maxDays) {
            calendar.set(Calendar.DAY_OF_MONTH, i)
            val date = calendar.time
            listDates.add(date)
            if(i == 1) firstDayOfMonth = date
            if(i == maxDays) lastDayOfMonth = date
        }
        //get previous month days
        val preMonthDay = getNameOfDate(firstDayOfMonth)
        if(preMonthDay != 0) {
            calendar.set(Calendar.MONTH, month - 2)
            val maxPreDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH)
            for (i in 0 until preMonthDay){
                calendar.set(Calendar.DAY_OF_MONTH, maxPreDays - i)
                listPreDates.add(calendar.time)
            }
        }
        //get next month days
        val nextMonthDay = getNameOfDate(lastDayOfMonth)
        if(preMonthDay != 6) {
            calendar.set(Calendar.MONTH, month)
            var maxNextDays = 0
            for (i in nextMonthDay + 1..6){
                calendar.set(Calendar.DAY_OF_MONTH, ++maxNextDays)
                listNextDates.add(calendar.time)
            }
        }

        listPreDates.addAll(listDates)
        listPreDates.addAll(listNextDates)

        return listPreDates
    }
    private fun getNameOfDate(date: Date): Int{
        val simpleDateFormat: SimpleDateFormat = SimpleDateFormat("EEEE")
        val nameOfDate = simpleDateFormat.format(date)
        when(nameOfDate){
            "Monday" -> return 0
            "Tuesday" -> return 1
            "Wednesday" -> return 2
            "Thursday" -> return 3
            "Friday" -> return 4
            "Saturday" -> return 5
        }
        return 6
    }
}

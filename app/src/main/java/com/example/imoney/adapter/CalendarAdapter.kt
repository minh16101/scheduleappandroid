package com.example.imoney.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.imoney.R
import com.example.imoney.fragment.CalendarFragment
import com.example.imoney.fragment.ICalendarView
import com.example.imoney.untils.DateUntils
import java.util.Calendar
import java.util.Date

class CalendarAdapter(mContext: Context?, listDates: List<Date>, mView: ICalendarView) :
    BaseAdapter() {
    private val listDates = listDates
    private val mContext = mContext
    private lateinit var mTextViewDay: TextView
    private val mViewCalendar = mView
    override fun getCount(): Int {
        return listDates.size
    }

    override fun getItem(pos: Int): Date {
        return listDates[pos]
    }

    override fun getItemId(pos: Int): Long {
        return pos.toLong()
    }

    override fun getView(pos: Int, view: View?, parent: ViewGroup?): View {
        val layoutInflater = LayoutInflater.from(mContext)
        var dateView = view
        if (dateView == null) {
            dateView = layoutInflater.inflate(R.layout.text_day_of_calender, parent, false)
            onBindViewHolder(dateView, pos)
            sendDataToView(dateView, pos)
            //check current day to fill background
            checkCurrentDay(pos)
        }
        return dateView!!
    }

    private fun onBindViewHolder(dateView: View?, pos: Int) {
        dateView?.let {
            mTextViewDay = it.findViewById(R.id.text_date)
            mTextViewDay.setOnClickListener { mViewCalendar.onSelectedDay(pos) }
        }
    }

    private fun checkCurrentDay(pos: Int) {
        val today = DateUntils.getToday()
        val todayCalendar = Calendar.getInstance()
        todayCalendar.time = today.time
        val posCalendar = Calendar.getInstance()
        posCalendar.time = listDates[pos]
        if (todayCalendar.get(Calendar.DAY_OF_MONTH) == posCalendar.get(Calendar.DAY_OF_MONTH)
            && todayCalendar.get(Calendar.MONTH) == posCalendar.get(Calendar.MONTH)
            && todayCalendar.get(Calendar.YEAR) == posCalendar.get(Calendar.YEAR)) {
            mContext?.resources?.let {
                it?.getColor(R.color.white)?.let { it1 -> mTextViewDay.setTextColor(it1) }
            }
            mTextViewDay.setBackgroundResource(R.drawable.background_seleted_day_in_calendar)
        }
    }

    private fun sendDataToView(dateView: View?, pos: Int) {
        mTextViewDay.text = listDates[pos].toString()
    }
}
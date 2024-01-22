package com.example.imoney.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.imoney.R
import java.util.Date

class CalendarAdapter(mContext: Context?, listDates: List<Date>) : BaseAdapter() {
    private val listDates = listDates
    private val mContext = mContext
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
        if(dateView == null) {
            dateView = layoutInflater.inflate(R.layout.text_day_of_calender, parent, false)
            sendDataToView(dateView, pos)
            checkCurrentDay(dateView, pos)
        }
        return dateView!!
    }

    private fun checkCurrentDay(dateView: View?, pos: Int) {
        dateView?.let{

        }
    }

    private fun sendDataToView(dateView: View?, pos: Int) {
        dateView?.let {
            val textViewDate = it.findViewById<TextView>(R.id.text_date)
            textViewDate.text = listDates[pos].toString()
        }
    }

}
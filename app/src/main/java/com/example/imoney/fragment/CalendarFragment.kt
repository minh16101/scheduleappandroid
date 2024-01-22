package com.example.imoney.fragment

import android.content.Context
import android.os.Bundle
import android.text.format.DateUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import android.widget.ImageButton
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import com.example.imoney.R
import com.example.imoney.adapter.CalendarAdapter
import com.example.imoney.presenter.CalendarPresenter
import com.example.imoney.untils.DateUntils

open class CalendarFragment : Fragment() {
    private val mPresenter: CalendarPresenter = CalendarPresenter()
    private lateinit var gridViewCalendar: GridView
    private lateinit var buttonNextMonth: ImageButton
    private lateinit var buttonPreMonth: ImageButton
    private lateinit var monthTextView: TextView
    private lateinit var yearTextView: TextView
    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    @LayoutRes
    protected fun getLayoutId(): Int {
        return R.layout.calendar_custom
    }

    protected fun onBindId(view: View) {
        gridViewCalendar = view.findViewById<GridView>(R.id.gridview_calendar)
        buttonNextMonth = view.findViewById<ImageButton>(R.id.next_month)
        buttonPreMonth = view.findViewById<ImageButton>(R.id.previous_month)
        monthTextView = view.findViewById<TextView>(R.id.month_in_calendar)
        yearTextView = view.findViewById<TextView>(R.id.year_in_calendar)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(getLayoutId(), container, false)
        onBindId(view)
        //set listener
        buttonPreMonth.setOnClickListener {
            mPresenter.getDateFromMonthAndYear(
                monthTextView.text.toString(),
                yearTextView.text.toString()
            )
        }
        buttonNextMonth.setOnClickListener {
            mPresenter.getDateFromMonthAndYear(
                monthTextView.text.toString(),
                yearTextView.text.toString()
            )
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val calendarAdapter = CalendarAdapter(context, mPresenter.listDates)
        gridViewCalendar.adapter = calendarAdapter
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CalendarFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}
package com.example.imoney.fragment.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.imoney.fragment.base.delegate.BaseDelegateFactory
import com.example.imoney.fragment.base.viewmodel.BaseViewModel
import com.example.imoney.presenter.base.BasePresenter

abstract class BaseFragment<V: IView, VM: BaseViewModel>: Fragment() {
    open val delegateFactory: BaseDelegateFactory<V, VM> = TODO()
    override fun onAttach(context: Context) {
        super.onAttach(context)
        //database
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(getLayoutId(), container, false)
        onBindId(view)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
    abstract fun onBindId(view: View)

    abstract fun getLayoutId(): Int
}

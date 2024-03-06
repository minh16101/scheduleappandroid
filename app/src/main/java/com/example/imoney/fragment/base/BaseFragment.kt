package com.example.imoney.fragment.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.imoney.fragment.base.delegate.BaseDelegateFactory
import com.example.imoney.fragment.base.viewmodel.BaseViewModel

abstract class BaseFragment : Fragment() {
    open val mViewModel: BaseViewModel by viewModels()
    open val delegateFactory: BaseDelegateFactory<*, *> by lazy {
        BaseDelegateFactory<BaseFragment, BaseViewModel>(this, mViewModel)
    }

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
//        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(getLayoutId(), container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    abstract fun getLayoutId(): Int
}

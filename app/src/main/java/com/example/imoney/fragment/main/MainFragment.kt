package com.example.imoney.fragment.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.imoney.R
import com.example.imoney.fragment.base.BaseFragment
import com.example.imoney.fragment.base.delegate.BaseDelegateFactory
import com.example.imoney.fragment.main.delegate.MainDelegateFactory
import com.example.imoney.fragment.main.viewmodel.MainViewModel

class MainFragment<V: IMainView, VM: MainViewModel> : BaseFragment<V, VM>() {
    // TODO: Rename and change types of parameters
    override val delegateFactory: BaseDelegateFactory<V, VM>
        get() = MainDelegateFactory<V, VM>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_main
    }

    override fun onBindId(view: View) {

    }
}
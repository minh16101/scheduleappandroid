package com.example.imoney.fragment.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.imoney.R
import com.example.imoney.fragment.base.BaseFragment
import com.example.imoney.fragment.base.delegate.BaseDelegateFactory
import com.example.imoney.fragment.base.viewmodel.BaseViewModel
import com.example.imoney.fragment.main.delegate.MainDelegateFactory
import com.example.imoney.fragment.main.viewmodel.MainViewModel

class MainFragment : BaseFragment() {
    // TODO: Rename and change types of parameters
    override val mViewModel: MainViewModel by viewModels()
    override val delegateFactory: BaseDelegateFactory<*, *> by lazy {
        MainDelegateFactory<MainFragment, MainViewModel>(this, mViewModel)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_main
    }
}
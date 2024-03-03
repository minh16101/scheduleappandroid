package com.example.imoney.fragment.main.delegate

import com.example.imoney.fragment.base.delegate.BaseDelegate
import com.example.imoney.fragment.main.IMainView
import com.example.imoney.fragment.main.viewmodel.MainViewModel

class MainObserverDelegate<V: IMainView, VM: MainViewModel>: BaseDelegate<V, VM>() {
    override fun onBindViewId() {
        TODO("Not yet implemented")
    }

    override fun setListener() {
        TODO("Not yet implemented")
    }
}
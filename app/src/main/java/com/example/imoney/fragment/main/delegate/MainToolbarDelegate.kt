package com.example.imoney.fragment.main.delegate

import com.example.imoney.fragment.base.delegate.BaseDelegate
import com.example.imoney.fragment.main.IMainView
import com.example.imoney.fragment.main.MainFragment
import com.example.imoney.fragment.main.viewmodel.MainViewModel

class MainToolbarDelegate<V: MainFragment, VM: MainViewModel>(f: V, vm: VM): BaseDelegate<V, VM>(f, vm) {
    override fun onBindViewId() {
    }

    override fun setListener() {
    }
}
package com.example.imoney.fragment.main.delegate

import com.example.imoney.common.KeyDelegate
import com.example.imoney.fragment.base.delegate.BaseDelegate
import com.example.imoney.fragment.base.delegate.BaseDelegateFactory
import com.example.imoney.fragment.main.IMainView
import com.example.imoney.fragment.main.MainFragment
import com.example.imoney.fragment.main.viewmodel.MainViewModel

class MainDelegateFactory<V: MainFragment, VM: MainViewModel>(f: V, vm: VM): BaseDelegateFactory<V, VM>(f, vm) {
    override fun createListDelegates(): List<Pair<KeyDelegate, BaseDelegate<V, VM>>> {
        return listOf(
            Pair(KeyDelegate.MainToolbarDelegate, MainToolbarDelegate(f, vm)),
            Pair(KeyDelegate.MainObserverDelegate, MainObserverDelegate(f, vm)),
            Pair(KeyDelegate.MainScheduleDelegate, MainScheduleDelegate(f, vm)),
            Pair(KeyDelegate.MainTimeDelegate, MainTimeDelegate(f, vm)),
        )
    }
}
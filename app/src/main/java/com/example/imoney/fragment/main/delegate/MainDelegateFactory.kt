package com.example.imoney.fragment.main.delegate

import com.example.imoney.common.KeyDelegate
import com.example.imoney.fragment.base.delegate.BaseDelegate
import com.example.imoney.fragment.base.delegate.BaseDelegateFactory
import com.example.imoney.fragment.main.IMainView
import com.example.imoney.fragment.main.viewmodel.MainViewModel

class MainDelegateFactory<V: IMainView, VM: MainViewModel>: BaseDelegateFactory<V, VM>() {
    override fun createListDelegates(): List<Pair<KeyDelegate, BaseDelegate<V, VM>>> {
        return listOf(
            Pair(KeyDelegate.MainToolbarDelegate, MainToolbarDelegate<V, VM>()),
            Pair(KeyDelegate.MainObserverDelegate, MainObserverDelegate<V, VM>()),
            Pair(KeyDelegate.MainScheduleDelegate, MainScheduleDelegate<V, VM>()),
            Pair(KeyDelegate.MainTimeDelegate, MainTimeDelegate<V, VM>()),
        )
    }
}
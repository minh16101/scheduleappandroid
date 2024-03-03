package com.example.imoney.fragment.base.delegate

import com.example.imoney.common.KeyDelegate
import com.example.imoney.fragment.base.IView
import com.example.imoney.fragment.base.viewmodel.BaseViewModel

//factory se goi trong fragment, oncreate cua base factory se duoc goi trong oncreate cua fragment => oncreate cua delegate xz se dc goi trong oncreate cua fragment
abstract class BaseDelegateFactory<V: IView, VM: BaseViewModel> {
    private val listDelegate: List<Pair<KeyDelegate, BaseDelegate<V, VM>>> by lazy { createListDelegates() }
    abstract fun createListDelegates(): List<Pair<KeyDelegate, BaseDelegate<V, VM>>>

    public fun onCreate() {
        listDelegate.forEach {
            it.second.onCreate()
        }
    }

    public fun onCreateView() {
        listDelegate.forEach {
            it.second.onCreateView()
        }
    }

    public fun onViewCreated() {
        listDelegate.forEach {
            it.second.onViewCreated()
        }
    }

    public fun onStart() {
        listDelegate.forEach {
            it.second.onStart()
        }
    }

    public fun onResume() {
        listDelegate.forEach {
            it.second.onResume()
        }
    }

    public fun onPause() {
        listDelegate.forEach {
            it.second.onPause()
        }
    }

    public fun onStop() {
        listDelegate.forEach {
            it.second.onStop()
        }
    }

    public fun onDestroy() {
        listDelegate.forEach {
            it.second.onDestroy()
        }
    }
}
package com.example.imoney.fragment.base.delegate

import com.example.imoney.common.KeyDelegate
import com.example.imoney.fragment.base.BaseFragment
import com.example.imoney.fragment.base.IView
import com.example.imoney.fragment.base.viewmodel.BaseViewModel
import java.util.EnumMap

//factory se goi trong fragment, oncreate cua base factory se duoc goi trong oncreate cua fragment => oncreate cua delegate xz se dc goi trong oncreate cua fragment
open class BaseDelegateFactory<V : BaseFragment, VM : BaseViewModel>(
    val f: V,
    val vm: VM
) {
    private val listDelegate: List<Pair<KeyDelegate, BaseDelegate<V, VM>>> by lazy { createListDelegates() }
    private lateinit var hashDelegate: EnumMap<KeyDelegate, BaseDelegate<V, VM>>
    open fun createListDelegates(): List<Pair<KeyDelegate, BaseDelegate<V, VM>>> {
        return emptyList()
    }

    fun init() {
        createListDelegates().forEach {
            hashDelegate[it.first] = it.second
        }
    }

    private fun getListDelegate(): MutableCollection<BaseDelegate<V, VM>> {
        return hashDelegate.values
    }

    public fun onCreate() {
        getListDelegate().forEach {
            it.onCreate()
        }
    }

    public fun onCreateView() {
        getListDelegate().forEach {
            it.onCreate()
        }
    }

    public fun onViewCreated() {
        getListDelegate().forEach {
            it.onCreate()
        }
    }

    public fun onStart() {
        getListDelegate().forEach {
            it.onCreate()
        }
    }

    public fun onResume() {
        getListDelegate().forEach {
            it.onCreate()
        }
    }

    public fun onPause() {
        getListDelegate().forEach {
            it.onCreate()
        }
    }

    public fun onStop() {
        getListDelegate().forEach {
            it.onCreate()
        }
    }

    public fun onDestroy() {
        getListDelegate().forEach {
            it.onCreate()
        }
    }
}
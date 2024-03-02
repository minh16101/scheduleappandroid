package com.example.imoney.fragment.base.delegate

//factory se goi trong fragment, oncreate cua base factory se duoc goi trong oncreate cua fragment => oncreate cua delegate xz se dc goi trong oncreate cua fragment
abstract class BaseDelegateFactory {
    private val listDelegate: List<BaseDelegate> by lazy { createListDelegates() }
    abstract fun createListDelegates(): List<BaseDelegate>

    public fun onCreate() {
        listDelegate.forEach {
            it.onCreate()
        }
    }

    public fun onCreateView() {
        listDelegate.forEach {
            it.onCreateView()
        }
    }

    public fun onViewCreated() {
        listDelegate.forEach {
            it.onViewCreated()
        }
    }

    public fun onStart() {
        listDelegate.forEach {
            it.onStart()
        }
    }

    public fun onResume() {
        listDelegate.forEach {
            it.onResume()
        }
    }

    public fun onPause() {
        listDelegate.forEach {
            it.onPause()
        }
    }

    public fun onStop() {
        listDelegate.forEach {
            it.onStop()
        }
    }

    public fun onDestroy() {
        listDelegate.forEach {
            it.onDestroy()
        }
    }
}
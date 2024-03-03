package com.example.imoney.fragment.base.delegate

import com.example.imoney.fragment.base.BaseFragment
import com.example.imoney.fragment.base.IView
import com.example.imoney.fragment.base.viewmodel.BaseViewModel

abstract class BaseDelegate<V: IView, VM: BaseViewModel> {
    public fun onCreate() {

    }

    public fun onCreateView() {
        onBindViewId()
    }

    public fun onViewCreated() {

    }

    public fun onStart() {

    }

    public fun onResume() {

    }

    public fun onPause() {

    }

    public fun onStop() {

    }

    public fun onDestroy() {

    }

    abstract fun onBindViewId()
    abstract fun setListener()

}

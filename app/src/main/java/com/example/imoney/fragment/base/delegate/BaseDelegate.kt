package com.example.imoney.fragment.base.delegate

import com.example.imoney.fragment.base.BaseFragment
import com.example.imoney.fragment.base.viewmodel.BaseViewModel

abstract class BaseDelegate<> {
    public fun onCreate() {

    }

    public fun onCreateView() {

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

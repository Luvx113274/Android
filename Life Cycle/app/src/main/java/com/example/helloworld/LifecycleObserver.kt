package com.example.helloworld

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

class LifecycleObserver : LifecycleEventObserver {
    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when(event.toString()){
            "ON_CREATE" -> Log.d("l0g", "onCreate event: ")
            "ON_START" -> Log.d("l0g", "onStart event: ")
            "ON_RESUME" -> Log.d("l0g", "onResume event: ")
            "ON_PAUSE" -> Log.d("l0g", "onPause event: ")
            "ON_STOP" -> Log.d("l0g", "onStop event: ")
            "ON_DESTROY" -> Log.d("l0g", "onDestroy event: ")
        }
    }
}
package com.subhambnikash.puredependecyinjectionexample

import android.util.Log

class Battery {

    init {
        Log.d("dependency", "battery initialized: ")
    }

    fun getBattery(){
        Log.d("dependency", "getSpace: batteryAvailable")
    }

}
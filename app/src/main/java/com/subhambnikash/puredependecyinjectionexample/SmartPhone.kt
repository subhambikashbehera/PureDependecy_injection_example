package com.subhambnikash.puredependecyinjectionexample

import android.util.Log

class SmartPhone(battery: Battery,networkAva: NetworkAva,memoryCard: MemoryCard) {
    init {
        battery.getBattery()
        networkAva.getConnection()
        memoryCard.getSpace()
        Log.d("dependency", ": smartPhone initialised ")
    }

    fun calling(){
        Log.d("dependency", "calling: ")
    }
}
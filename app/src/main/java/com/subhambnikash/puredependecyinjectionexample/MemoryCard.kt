package com.subhambnikash.puredependecyinjectionexample

import android.util.Log

class MemoryCard {

    init {
        Log.d("dependency", "Memory initialized: ")
    }

    fun getSpace(){
        Log.d("dependency", "space AVAILABLE")
    }
}
package com.subhambnikash.puredependecyinjectionexample

import android.util.Log

class NetworkAva(serviceProvider:String){

    var serviceProviderX:String = serviceProvider
    init {
        Log.d("dependency", "netWorkInitialised: ")
    }

    fun getConnection(){
        Log.d("dependency", "getConnection: networkAvailable")
    }

}
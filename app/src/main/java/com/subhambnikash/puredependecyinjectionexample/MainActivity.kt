package com.subhambnikash.puredependecyinjectionexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        SmartPhone(Battery(),
            NetworkAva("serviceProvider"),MemoryCard
        ()).calling()
    }




}
package me.sproutstudio.sproutcard.core

import android.app.Application

class App:Application()
{
    override fun onCreate()
    {
        super.onCreate()
        startKoin{
            
        }
    }
}

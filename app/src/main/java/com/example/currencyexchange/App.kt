package com.example.currencyexchange

import android.app.Application
import com.example.currencyexchange.data.di.DataModules
import com.example.currencyexchange.domain.di.DomainModule
import com.example.currencyexchange.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }
        DataModules.load()
        DomainModule.load()
        PresentationModule.load()
    }
}
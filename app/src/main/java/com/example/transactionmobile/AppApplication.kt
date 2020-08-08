package com.example.transactionmobile

import android.app.Application
import com.example.transactionmobile.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * Main class
 */
class AppApplication: Application() {

    override fun onCreate() {
        super.onCreate();
        //init koin dependency injection
        startKoin {
            androidContext(this@AppApplication)
            modules(viewModelModule)
        }
    }
}
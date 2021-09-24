package it.mapo.indie.koinexample

import android.app.Application
import it.mapo.indie.koinexample.modules.apiModule
import it.mapo.indie.koinexample.modules.repositoryModule
import it.mapo.indie.koinexample.modules.retrofitModule
import it.mapo.indie.koinexample.modules.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@App)
            modules(listOf(repositoryModule, viewModelModule, retrofitModule, apiModule))
        }
    }
}
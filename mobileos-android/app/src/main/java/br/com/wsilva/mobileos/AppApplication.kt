package br.com.wsilva.mobileos

import android.app.Application
import br.com.wsilva.mobileos.di.AppComponent
import br.com.wsilva.mobileos.di.AppDatabaseModule
import br.com.wsilva.mobileos.di.AppModule
import br.com.wsilva.mobileos.di.DaggerAppComponent

class AppApplication: Application() {
    companion object {
        @JvmStatic
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .appDatabaseModule(AppDatabaseModule(this))
                .build()
        appComponent.inject(this)
    }
}
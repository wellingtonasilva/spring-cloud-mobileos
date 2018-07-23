package br.com.wsilva.mobileos.di

import android.app.Application
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class, AppDatabaseModule::class))
interface AppComponent {
    fun inject(application: Application)
    var appDataModule: AppDatabaseModule
    var application: Application
}
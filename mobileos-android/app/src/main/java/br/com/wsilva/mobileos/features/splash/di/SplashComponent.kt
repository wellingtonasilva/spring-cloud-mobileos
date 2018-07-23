package br.com.wsilva.mobileos.features.splash.di

import br.com.wsilva.mobileos.features.splash.SplashFragment
import br.com.wsilva.mobileos.features.splash.SplashPresenter
import dagger.Component

@Component(modules = arrayOf(SplashModule::class))
interface SplashComponent {
    fun inject(fragment: SplashFragment)
    fun inject(presenter: SplashPresenter)
}
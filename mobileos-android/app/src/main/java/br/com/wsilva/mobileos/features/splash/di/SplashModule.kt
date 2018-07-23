package br.com.wsilva.mobileos.features.splash.di

import br.com.wsilva.mobileos.features.splash.SplashContract
import br.com.wsilva.mobileos.features.splash.SplashFragment
import br.com.wsilva.mobileos.features.splash.SplashPresenter
import dagger.Module
import dagger.Provides

@Module
class SplashModule(private val view: SplashFragment) {
    @Provides
    fun providesSplashView(): SplashContract.View {
        return view
    }

    @Provides
    fun providesSplashPresenter(view: SplashContract.View): SplashContract.Presenter {
        return SplashPresenter(view)
    }
}
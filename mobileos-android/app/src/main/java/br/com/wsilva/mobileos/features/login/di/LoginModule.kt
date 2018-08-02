package br.com.wsilva.mobileos.features.login.di

import br.com.wsilva.mobileos.features.login.LoginContract
import br.com.wsilva.mobileos.features.login.LoginFragment
import br.com.wsilva.mobileos.features.login.LoginPresenter
import dagger.Module
import dagger.Provides

@Module
class LoginModule(private val view: LoginFragment) {
    @Provides
    fun providesLoginView(): LoginContract.View {
        return view
    }

    @Provides
    fun providesLoginPresenter(view: LoginContract.View): LoginContract.Presenter {
        return LoginPresenter(view)
    }
}
package br.com.wsilva.mobileos.features.login.di

import br.com.wsilva.mobileos.features.login.LoginFragment
import br.com.wsilva.mobileos.features.login.LoginPresenter
import dagger.Component

@Component(modules = arrayOf(LoginModule::class))
interface LoginComponent {
    fun inject(presenter: LoginPresenter)
    fun inject(fragment: LoginFragment)
}
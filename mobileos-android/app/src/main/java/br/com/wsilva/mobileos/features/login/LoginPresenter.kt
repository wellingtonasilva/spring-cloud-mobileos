package br.com.wsilva.mobileos.features.login

import javax.inject.Inject

class LoginPresenter: LoginContract.Presenter {
    val view: LoginContract.View

    @Inject
    constructor(view: LoginContract.View) {
        this.view = view
    }

    override fun login() {
        view.showMenuPrincipal()
    }

    override fun sair() {
        view.sair()
    }

    override fun create() {
    }

    override fun destroy() {
    }
}
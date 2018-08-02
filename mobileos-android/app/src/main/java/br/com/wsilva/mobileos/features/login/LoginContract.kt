package br.com.wsilva.mobileos.features.login

import br.com.wsilva.mobileos.core.BasicPresenter

interface LoginContract {
    interface View {
        fun showMenuPrincipal()
        fun sair()
    }

    interface Presenter: BasicPresenter {
        fun login()
        fun sair()
    }
}
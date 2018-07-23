package br.com.wsilva.mobileos.features.splash

import br.com.wsilva.mobileos.core.BasicPresenter

interface SplashContract {
    interface View {
        fun showLogin()
    }

    interface Presenter : BasicPresenter {
        fun startAnimation()
    }
}
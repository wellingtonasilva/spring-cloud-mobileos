package br.com.wsilva.mobileos.features.splash

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class SplashPresenter: SplashContract.Presenter {
    val view: SplashContract.View

    @Inject
    constructor(view: SplashContract.View) {
        this.view = view
    }

    override fun startAnimation() {
        val observable = Observable.timer(3, TimeUnit.SECONDS)
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { view.showLogin() }
    }

    override fun create() {
    }

    override fun destroy() {
    }
}
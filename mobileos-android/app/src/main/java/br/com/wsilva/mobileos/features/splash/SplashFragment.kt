package br.com.wsilva.mobileos.features.splash

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.wsilva.mobileos.R
import br.com.wsilva.mobileos.core.BasicFragment
import br.com.wsilva.mobileos.features.login.LoginActivity
import br.com.wsilva.mobileos.features.splash.di.DaggerSplashComponent
import br.com.wsilva.mobileos.features.splash.di.SplashModule
import javax.inject.Inject

class SplashFragment: BasicFragment(), SplashContract.View {
    @Inject
    lateinit var presenter: SplashPresenter

    companion object {
        val TAG: String = "SplashFragment"
        fun newInstance(): SplashFragment {
            return SplashFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerSplashComponent.builder()
                .splashModule(SplashModule(this))
                .build()
                .inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater?.inflate(R.layout.lay_frg_splash, container, false)

        return root
    }

    override fun onResume() {
        super.onResume()
        presenter.startAnimation()
    }

    override fun showLogin() {
        val intent = Intent(activity, LoginActivity::class.java)
        startActivity(intent)
        activity.finish()
    }
}
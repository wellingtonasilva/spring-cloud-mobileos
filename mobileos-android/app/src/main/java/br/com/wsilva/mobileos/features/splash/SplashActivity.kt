package br.com.wsilva.mobileos.features.splash

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import android.view.Window
import br.com.wsilva.mobileos.R
import br.com.wsilva.mobileos.core.BasicActivity

class SplashActivity: BasicActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        setContentView(R.layout.lay_act_template)
        fullScreen()
        //Configuração inicial
        init(savedInstanceState)
    }

    fun init(savedInstanceState: Bundle?) {
        val fragmentManager = supportFragmentManager
        var fragment = fragmentManager.findFragmentByTag(SplashFragment.TAG)
        if (fragment == null) {
            fragment = SplashFragment.newInstance()
        }
        if (savedInstanceState == null) {
            fragment.arguments = intent.extras
        } else {
            fragment.arguments = savedInstanceState
        }
        addFragmentToActivity(fragmentManager, fragment, R.id.frameLayout, SplashFragment.TAG)
    }
}
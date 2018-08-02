package br.com.wsilva.mobileos.features.principal

import android.os.Bundle
import android.view.Window
import br.com.wsilva.mobileos.R
import br.com.wsilva.mobileos.core.BasicActivity

class MenuPrincipalActivity: BasicActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.lay_act_template)
        fullScreen()
        //Configuração inicial
        init(savedInstanceState)
    }

    fun init(savedInstanceState: Bundle?) {
        val fragmentManager = supportFragmentManager
        var fragment = fragmentManager.findFragmentByTag(MenuPrincipalFragment.TAG)
        if (fragment == null) {
            fragment = MenuPrincipalFragment.newInstance()
        }
        if (savedInstanceState == null) {
            fragment.arguments = intent.extras
        } else {
            fragment.arguments = savedInstanceState
        }
        addFragmentToActivity(fragmentManager, fragment, R.id.frameLayout, MenuPrincipalFragment.TAG)
    }
}
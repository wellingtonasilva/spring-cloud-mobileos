package br.com.wsilva.mobileos.features.login

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.wsilva.mobileos.R
import br.com.wsilva.mobileos.core.BasicFragment
import br.com.wsilva.mobileos.features.login.di.DaggerLoginComponent
import br.com.wsilva.mobileos.features.login.di.LoginModule
import br.com.wsilva.mobileos.features.principal.MenuPrincipalActivity
import kotlinx.android.synthetic.main.lay_frg_login.*
import javax.inject.Inject

class LoginFragment: BasicFragment(), LoginContract.View {
    @Inject
    lateinit var presenter: LoginPresenter

    companion object {

        val TAG: String = "LoginFragment"
        fun newInstance(): LoginFragment {
            return LoginFragment()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerLoginComponent.builder()
                .loginModule(LoginModule(this))
                .build()
                .inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater?.inflate(R.layout.lay_frg_login, container, false)

        return root
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnLogin.setOnClickListener { presenter.login() }
    }

    override fun showMenuPrincipal() {
        val intent = Intent(activity, MenuPrincipalActivity::class.java)
        startActivity(intent)
        activity.finish()
    }

    override fun sair() {
        activity.finish()
    }
}
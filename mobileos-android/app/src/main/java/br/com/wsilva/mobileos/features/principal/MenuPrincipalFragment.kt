package br.com.wsilva.mobileos.features.principal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.wsilva.mobileos.R
import br.com.wsilva.mobileos.core.BasicFragment
import javax.inject.Inject

class MenuPrincipalFragment: BasicFragment(), MenuPrincipalContract.View {
    @Inject
    lateinit var presenter: MenuPrincipalPresenter

    companion object {

        val TAG: String = "MenuPrincipalFragment"
        fun newInstance(): MenuPrincipalFragment {
            return MenuPrincipalFragment()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater?.inflate(R.layout.lay_frg_menu_principal, container, false)

        return root
    }

    override fun onResume() {
        super.onResume()
    }
}
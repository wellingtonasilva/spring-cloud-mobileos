package br.com.wsilva.gpazure.core

import android.os.Bundle
import br.com.wsilva.mobileos.R
import br.com.wsilva.mobileos.core.BasicActivity

class SearchableActivity : BasicActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lay_act_searchable)
    }
}
package br.com.wsilva.mobileos.core

interface BasicView {
    fun showDialog(mensagem: String)
    fun showProgress()
    fun dismissProgress()
}
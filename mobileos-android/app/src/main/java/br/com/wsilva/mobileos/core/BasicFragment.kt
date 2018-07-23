package br.com.wsilva.mobileos.core

import android.app.ProgressDialog
import android.content.DialogInterface
import android.support.v4.app.Fragment
import android.util.Log
import br.com.wsilva.mobileos.R

open class BasicFragment : Fragment() {
    lateinit var progressDialog: ProgressDialog

    fun showDialog(mensagem: String) {
        Utils.createAlertDialog(activity, mensagem, R.string.app_name, R.string.app_ok,
                R.string.app_nao, DialogInterface.OnClickListener { d, i -> Log.d("", "") })
    }

    fun registerProgress() {
        progressDialog = ProgressDialog(activity)
        progressDialog.isIndeterminate = true
        progressDialog.max = 100;
        progressDialog.setMessage(activity.baseContext.resources.getText(R.string.app_aguarde))
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER)
        progressDialog.setCancelable(false)
    }

    fun showProgress() {
        progressDialog.show()
    }

    fun dismissProgress() {
        progressDialog.dismiss()
    }
}
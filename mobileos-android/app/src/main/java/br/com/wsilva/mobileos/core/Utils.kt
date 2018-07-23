package br.com.wsilva.mobileos.core

import android.R
import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.pm.PackageManager
import android.database.Cursor
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.ConnectivityManager
import android.os.Environment
import android.util.Log
import android.widget.SimpleCursorAdapter
import android.widget.Spinner
import java.util.*
import okhttp3.Credentials
import java.io.*

class Utils {
    companion object {
        fun createAlertDialog(context: Context, dialogMessage: String,
                              dialogTitle: Int, dialogOK: Int, dialogCancel: Int,
                              onPositiveButtonClickListener: DialogInterface.OnClickListener?) {
            val resources = context.resources
            // Cria Builder
            val builder = AlertDialog.Builder(context)
            // Configura Message
            builder.setMessage(dialogMessage)
            builder.setTitle(resources.getText(dialogTitle))
            if (onPositiveButtonClickListener != null) {
                builder.setPositiveButton(resources.getText(dialogOK), onPositiveButtonClickListener)
            }
            // Cria Alerta
            val dialog = builder.create()
            dialog.show()
        }

        /**
         * Salva uma String no SharedPreferences
         * @param context - Context da aplicação
         * @param sharedPreferencesName - Nome da SharedPreference
         * @param key - Chave
         * @param value - Valor
         * @return True se a informação foi persistida - false caso o contrário.
         */
        @Synchronized
        fun salvarSharedPreferences(context: Context,
                                    sharedPreferencesName: String, key: String,
                                    value: String): Boolean {
            try {
                val settings = context.getSharedPreferences(sharedPreferencesName, 0)
                val editor = settings.edit()
                editor.putString(key, value)
                editor.commit()
                return true
            } catch (e: Exception) {
                Log.e("$$$", e.message)
                return false
            }

        }

        @Synchronized
        fun obterSharedPreferences(context: Context,
                                   sharedPreferencesName: String, key: String): String {
            try {
                val settings = context.getSharedPreferences(sharedPreferencesName, 0)
                return settings.getString(key, "")
            } catch (e: Exception) {
                Log.e("$$$", e.message)
                return ""
            }

        }

        fun getReleaseNumber(context: Context): String {
            val packageManager = context.packageManager as PackageManager
            try {
                return packageManager.getPackageInfo(context.packageName, 0).versionName
            } catch (e: PackageManager.NameNotFoundException) {
                return ""
            }

        }

        fun getRandomUUID(): UUID {
            return UUID.randomUUID()
        }

        @Throws(IOException::class)
        fun createImageFile(context: Context): File {
            val imageFileName = "JPEG_" + getRandomUUID().toString()
            //File storageDir = context.getFilesDir();
            val storageDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)
            if (!storageDir.exists()) {
                storageDir.mkdirs()
            }

            return File.createTempFile(
                    imageFileName, /* prefix */
                    ".jpg", /* suffix */
                    storageDir          /* directory */
            )
        }


        fun criarFotoThumb(context: Context, filenameIn: ByteArray, externalFileDir: Boolean, name: String): File? {
            //Local para salvar as imagens
            var filesDir: File? = null
            // Cria BitmapFactory
            val options = BitmapFactory.Options()
            options.inTempStorage = ByteArray(16 * 1024)
            options.inPurgeable = true

            try {
                // Caminho
                if (externalFileDir) {
                    filesDir = context.getExternalFilesDir(null)
                } else {
                    filesDir = context.filesDir
                }

                //Thumb Directory
                val fileThumbDir = File(filesDir!!.absoluteFile.toString() + "/thumb")
                if (!fileThumbDir.exists()) {
                    fileThumbDir.mkdirs()
                }

                //Destino
                val fileOut = File(filesDir.absolutePath + "/thumb/" + name)
                //Cria arquivo destino
                val out = FileOutputStream(fileOut)
                //Carrega imagem
                val bitmap = BitmapFactory.decodeByteArray(filenameIn, 0, filenameIn.size, options)
                // Cria uma nova foto com tamanho reduzido
                val bitmapSmall = Bitmap.createScaledBitmap(bitmap, bitmap.width,
                        bitmap.height, false)
                // Comprime a foto
                bitmapSmall.compress(Bitmap.CompressFormat.JPEG, 50, out)
                //Fecha arquivo
                out.close()

                return fileOut
            } catch (e: FileNotFoundException) {
                e.printStackTrace()
                Log.d("Utils", "criarFotoThumb: " + e.message)
            } catch (e: IOException) {
                e.printStackTrace()
                Log.d("Utils", "criarFotoThumb: " + e.message)
            }

            return null
        }

        fun criarFotoThumb(context: Context, filenameIn: String, externalFileDir: Boolean): File? {
            //Local para salvar as imagens
            var filesDir: File? = null
            // Cria BitmapFactory
            val options = BitmapFactory.Options()
            options.inTempStorage = ByteArray(16 * 1024)
            options.inPurgeable = true

            try {
                // Caminho
                if (externalFileDir) {
                    filesDir = context.getExternalFilesDir(null)
                } else {
                    filesDir = context.filesDir
                }

                //Thumb Directory
                val fileThumbDir = File(filesDir!!.absoluteFile.toString() + "/thumb")
                if (!fileThumbDir.exists()) {
                    fileThumbDir.mkdirs()
                }
                //Arquivo de origem
                val fileIn = File(filenameIn)
                //Destino
                val fileOut = File(filesDir.absolutePath + "/thumb/" + fileIn.name)
                //Verifica se existe a imagem selecionada em Thumb
                if (fileIn.exists()) {
                    //Cria arquivo destino
                    val out = FileOutputStream(fileOut)
                    //Carrega imagem
                    val bitmap = BitmapFactory.decodeFile(fileIn.absolutePath, options)
                    // Cria uma nova foto com tamanho reduzido
                    val bitmapSmall = Bitmap.createScaledBitmap(bitmap, bitmap.width,
                            bitmap.height, false)
                    // Comprime a foto
                    bitmapSmall.compress(Bitmap.CompressFormat.JPEG, 50, out)
                    //Fecha arquivo
                    out.close()

                    return fileOut
                }
            } catch (e: FileNotFoundException) {
                e.printStackTrace()
                Log.d("Utils", "criarFotoThumb: " + e.message)
            } catch (e: IOException) {
                e.printStackTrace()
                Log.d("Utils", "criarFotoThumb: " + e.message)
            }

            return null
        }

        fun criarSimpleCursorAdapter(context: Context, cursor: Cursor, from: Array<String>,
                                     to: IntArray): SimpleCursorAdapter {
            val simpleCursorAdapter = SimpleCursorAdapter(context, R.layout.simple_spinner_item, cursor, from, to)
            simpleCursorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            return simpleCursorAdapter
        }

        fun getSpinnerItemId(spinner: Spinner, column: String): Int {
            val position = spinner.selectedItemPosition
            val adapter = spinner.adapter
            val c = adapter.getItem(position) as Cursor

            return c.getInt(c.getColumnIndex(column))
        }

        fun getSpinnerItemDescricao(spinner: Spinner, column: String): String {
            val position = spinner.selectedItemPosition
            val adapter = spinner.adapter
            val c = adapter.getItem(position) as Cursor

            return c.getString(c.getColumnIndex(column))
        }

        fun getSpinnerItemPositionFromId(spinner: Spinner, column: String, id: Int): Int {
            var position = 0
            val adapter = spinner.adapter
            //Quantidade de registros
            val qtd = adapter.count
            //Procura na lista
            for (i in 0 until qtd) {
                //Cursor
                val c = adapter.getItem(i) as Cursor
                //Verifica se é o mesmo valor
                if (c.getInt(c.getColumnIndex(column)) == id) {
                    position = i
                    break
                }
            }

            return position
        }

        fun isOnline(context: Context): Boolean {
            val connMgr = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val networkInfo = connMgr.activeNetworkInfo

            return networkInfo != null && networkInfo.isConnected
        }

        fun generateAuthorization(username: String, password: String): String {
            return Credentials.basic(username, password)
        }
    }
}
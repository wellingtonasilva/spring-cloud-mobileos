package br.com.wsilva.mobileos.model.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import br.com.wsilva.mobileos.model.dao.VeiculoTipoDAO
import br.com.wsilva.mobileos.model.entity.VeiculoTipoEntity

@Database(entities = arrayOf(VeiculoTipoEntity::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getVeiculoTipoDAO(): VeiculoTipoDAO
}
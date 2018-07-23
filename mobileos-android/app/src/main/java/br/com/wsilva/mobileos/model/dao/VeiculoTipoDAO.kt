package br.com.wsilva.mobileos.model.dao

import android.arch.persistence.room.*
import br.com.wsilva.mobileos.model.entity.VeiculoTipoEntity

@Dao
interface VeiculoTipoDAO {
    @Query("SELECT * FROM veiculo_tipo")
    fun listAll(): List<VeiculoTipoEntity>

    @Query("SELECT * FROM veiculo_tipo WHERE id = :id")
    fun get(id: Long): VeiculoTipoEntity

    @Delete
    fun delete(entity: VeiculoTipoEntity): Int

    @Query("DELETE FROM veiculo_tipo")
    fun deleteAll()

    @Insert
    fun insert(entity: VeiculoTipoEntity): Long

    @Update
    fun update(entity: VeiculoTipoEntity): Int

    @Query("SELECT COUNT(1) FROM veiculo_tipo")
    fun getRowCount() : Int
}
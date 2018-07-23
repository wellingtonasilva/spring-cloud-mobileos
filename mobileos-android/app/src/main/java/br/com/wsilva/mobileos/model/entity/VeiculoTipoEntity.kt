package br.com.wsilva.mobileos.model.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "veiculo_tipo")
class VeiculoTipoEntity(var id: Long,
                        var descricao: String)
{
    @ColumnInfo(name = "_id")
    @PrimaryKey(autoGenerate = true)
    var uid: Long = 0
}
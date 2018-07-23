package br.com.wsilva.mobileos.model.repository

import br.com.wsilva.mobileos.core.BasicRepository
import br.com.wsilva.mobileos.model.dao.VeiculoTipoDAO
import br.com.wsilva.mobileos.model.entity.VeiculoTipoEntity

class VeiculoTipoRepository(private val dao: VeiculoTipoDAO) : BasicRepository<VeiculoTipoEntity>() {
    override fun listAll(): List<VeiculoTipoEntity> {
        return dao.listAll()
    }

    override fun get(id: Long): VeiculoTipoEntity {
        return dao.get(id)
    }

    override fun delete(entity: VeiculoTipoEntity): Int {
        return dao.delete(entity)
    }

    override fun deleteAll() {
        dao.deleteAll()
    }

    override fun insert(entity: VeiculoTipoEntity): Long {
        return dao.insert(entity)
    }

    override fun update(entity: VeiculoTipoEntity): Int {
        return dao.update(entity)
    }

    override fun getRowCount(): Int {
        return dao.getRowCount()
    }

}
package br.com.wsilva.mobileos.core

abstract class BasicRepository<T> {
    abstract fun listAll(): List<T>
    abstract fun get(id: Long): T
    abstract fun delete(entity: T): Int
    abstract fun deleteAll()
    abstract fun insert(entity: T): Long
    abstract fun update(entity: T): Int
    abstract fun getRowCount(): Int
}
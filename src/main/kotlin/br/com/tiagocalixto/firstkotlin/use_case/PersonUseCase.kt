package br.com.tiagocalixto.firstkotlin.use_case

import br.com.tiagocalixto.firstkotlin.data_provider.entity.Person

interface PersonUseCase {

    fun save(person: Person) : Person
    fun update(person: Person) : Person
    fun delete(id:Int)
    fun findById(id:Int) : Person
}
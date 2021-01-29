package br.com.tiagocalixto.firstkotlin.data_provider.repository

import br.com.tiagocalixto.firstkotlin.data_provider.entity.Person
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository : CrudRepository<Person, Int>


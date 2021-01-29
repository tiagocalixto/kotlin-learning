package br.com.tiagocalixto.firstkotlin.use_case.impl

import br.com.tiagocalixto.firstkotlin.data_provider.entity.Person
import br.com.tiagocalixto.firstkotlin.data_provider.repository.PersonRepository
import br.com.tiagocalixto.firstkotlin.use_case.PersonUseCase
import org.springframework.stereotype.Service
import javax.persistence.EntityNotFoundException

@Service
class PersonUseCaseImpl(val repository: PersonRepository) : PersonUseCase {

    override fun save(person: Person): Person = repository.save(person)

    override fun update(person: Person): Person {

        val personDb = this.findById(person.id)
        personDb.age = person.age
        personDb.name = person.name
        return repository.save(person)
    }

    override fun delete(id: Int) {
        val person = this.findById(id)
        repository.delete(person)
    }

    override fun findById(id: Int): Person = repository
            .findById(id).orElseThrow { EntityNotFoundException("person not found!") }
}
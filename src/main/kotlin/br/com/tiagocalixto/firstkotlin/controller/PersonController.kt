package br.com.tiagocalixto.firstkotlin.controller

import br.com.tiagocalixto.firstkotlin.data_provider.entity.Person
import br.com.tiagocalixto.firstkotlin.use_case.PersonUseCase
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*


@Controller
@RequestMapping("person")
class PersonController(val personUseCase: PersonUseCase) {

    @PostMapping
    fun save(@RequestBody person: Person): ResponseEntity<Person> {

        person.id = 0
        return ResponseEntity.ok(personUseCase.save(person))
    }

    @PutMapping
    fun update(@RequestBody person: Person): ResponseEntity<Person> = ResponseEntity.ok(personUseCase.update(person))


    @GetMapping
    fun findById(@RequestParam id: Int): ResponseEntity<Person> = ResponseEntity.ok(personUseCase.findById(id))

}
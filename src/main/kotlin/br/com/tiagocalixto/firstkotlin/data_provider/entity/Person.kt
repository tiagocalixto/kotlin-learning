package br.com.tiagocalixto.firstkotlin.data_provider.entity

import javax.persistence.*


@Entity
@Table(name = "person")
data class Person(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int,
        var name: String,
        var age: Int)

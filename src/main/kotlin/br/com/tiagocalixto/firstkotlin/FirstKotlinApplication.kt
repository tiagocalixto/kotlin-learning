package br.com.tiagocalixto.firstkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FirstKotlinApplication

fun main(args: Array<String>) {
    runApplication<FirstKotlinApplication>(*args)
}

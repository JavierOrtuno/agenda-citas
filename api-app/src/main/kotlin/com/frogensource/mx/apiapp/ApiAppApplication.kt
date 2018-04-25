package com.frogensource.mx.apiapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ApiAppApplication

fun main(args: Array<String>) {
    runApplication<ApiAppApplication>(*args)
}

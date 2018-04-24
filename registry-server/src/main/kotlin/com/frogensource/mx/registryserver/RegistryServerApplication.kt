package com.frogensource.mx.registryserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class RegistryServerApplication

fun main(args: Array<String>) {
    runApplication<RegistryServerApplication>(*args)
}

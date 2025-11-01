package dev.jbringb.zenith

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ZenithApplication

fun main(args: Array<String>) {

    runApplication<ZenithApplication>(*args)
}

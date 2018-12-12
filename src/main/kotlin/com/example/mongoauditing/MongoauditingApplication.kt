package com.example.mongoauditing

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MongoauditingApplication

fun main(args: Array<String>) {
    runApplication<MongoauditingApplication>(*args)
}

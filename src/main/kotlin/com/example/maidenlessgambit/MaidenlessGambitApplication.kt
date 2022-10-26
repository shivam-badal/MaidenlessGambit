package com.example.maidenlessgambit

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MaidenlessGambitApplication

fun main(args: Array<String>) {
	println("Test")
	runApplication<MaidenlessGambitApplication>(*args)
}

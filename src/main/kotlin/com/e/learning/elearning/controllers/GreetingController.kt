package com.e.learning.elearning.controllers

import com.e.learning.elearning.services.GreetingService
import mu.KLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/greeting")
class GreetingController(val greetingService: GreetingService) {
    companion object : KLogging()

    @GetMapping("/{name}")
    fun sayGreeting(@PathVariable("name") name: String): String {
        logger.info { "Hello $name" }
        return greetingService.sayGreeting(name)
    }
}
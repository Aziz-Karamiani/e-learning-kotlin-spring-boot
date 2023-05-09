package com.e.learning.elearning.controllers

import com.e.learning.elearning.services.GreetingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/greeting")
class GreetingController(val greetingService: GreetingService) {
    @GetMapping("/{name}")
    fun sayGreeting(@PathVariable("name") name: String): String = greetingService.sayGreeting(name)
}
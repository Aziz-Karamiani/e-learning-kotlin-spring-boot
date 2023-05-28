package com.e.learning.elearning.controllers

import com.e.learning.elearning.services.GreetingServiceI18
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Profile("EN")
@Controller
@RequestMapping("/v1")
class Myi18NController(@Qualifier("i18NService") val greetingServiceI18: GreetingServiceI18?) {
    @GetMapping("/i18")
    fun sayHello(): String? {
        return this.greetingServiceI18?.sayHello()
    }
}
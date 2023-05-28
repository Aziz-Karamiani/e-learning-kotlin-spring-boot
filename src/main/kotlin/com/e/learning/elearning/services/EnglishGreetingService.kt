package com.e.learning.elearning.services

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Profile("EN")
@Service("i18NService")
class EnglishGreetingService: GreetingServiceI18 {
    override fun sayHello(): String {
        return "Hello World!"
    }
}
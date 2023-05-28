package com.e.learning.elearning.services

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Profile("ES")
@Service("i18NService")
class SpanishGreetingService : GreetingServiceI18 {
    override fun sayHello(): String {
        return "Hola Mundo"
    }
}
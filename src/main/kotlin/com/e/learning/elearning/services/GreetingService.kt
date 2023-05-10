package com.e.learning.elearning.services

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class GreetingService {

    @Value("\${message}")
    lateinit var message: String
    fun sayGreeting(name: String): String = "$name, $message"
}
package com.e.learning.elearning.services

import org.springframework.stereotype.Service

@Service
class GreetingService {
    fun sayGreeting(name: String): String = "Hello $name"
}
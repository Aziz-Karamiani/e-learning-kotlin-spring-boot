package com.e.learning.elearning

import com.e.learning.elearning.controllers.CourseController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext

@SpringBootApplication
class ELearningApplication

fun main(args: Array<String>) {
    val applicationContext: ApplicationContext = runApplication<ELearningApplication>(*args)
    val courseController: CourseController = applicationContext.getBean(CourseController::class.java)
    println("Get Bean")
    courseController.sayHello()
}

package com.e.learning.elearning.controllers

import com.e.learning.elearning.dto.CourseDTO
import com.e.learning.elearning.services.CourseService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/courses")
class CourseController(val courseService: CourseService) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun saveCourse(@RequestBody courseDTO: CourseDTO): CourseDTO {
        return courseService.saveCourse(courseDTO)
    }

    @GetMapping
    fun retrieveAllCourses(): List<CourseDTO> {
        return courseService.retrieveAllCourses()
    }

    @PutMapping("/{course_id}")
    @ResponseStatus(HttpStatus.OK)
    fun updateCourse(
        @RequestBody courseDTO: CourseDTO,
        @PathVariable("course_id") courseId: Int
    ): CourseDTO = courseService.updateCourse(courseId, courseDTO)
}
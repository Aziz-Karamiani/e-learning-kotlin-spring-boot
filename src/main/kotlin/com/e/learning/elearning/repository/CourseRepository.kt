package com.e.learning.elearning.repository

import com.e.learning.elearning.entity.Course
import org.springframework.data.repository.CrudRepository

interface CourseRepository : CrudRepository<Course, Int> {
}
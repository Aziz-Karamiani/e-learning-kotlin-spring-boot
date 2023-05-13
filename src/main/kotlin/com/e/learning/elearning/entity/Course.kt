package com.e.learning.elearning.entity

import javax.persistence.*

@Entity
@Table(name = "Courses")
data class Course(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int?,
    var name: String,
    var category: String
)
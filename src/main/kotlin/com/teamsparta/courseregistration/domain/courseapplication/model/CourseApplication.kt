package com.teamsparta.courseregistration.domain.courseapplication.model

import com.teamsparta.courseregistration.domain.course.model.Course
import com.teamsparta.courseregistration.domain.user.model.User
import jakarta.persistence.*

@Entity
@Table(name = "course_application")
class CourseApplication(
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    var status: CourseApplicationStatus = CourseApplicationStatus.PENDING,

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    val course: Course,

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    val user: User
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}
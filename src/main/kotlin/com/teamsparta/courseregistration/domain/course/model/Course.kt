package com.teamsparta.courseregistration.domain.course.model

import com.teamsparta.courseregistration.domain.courseapplication.model.CourseApplication
import com.teamsparta.courseregistration.domain.lecture.model.Lecture
import jakarta.persistence.*

@Entity
@Table(name = "course")
class Course(
    @Column(name = "title", nullable = false)
    var title: String,

    @Column(name = "description")
    var description: String? = null,

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    var status: CourseStatus = CourseStatus.OPEN,

    @Column(name = "max_applicants", nullable = false)
    val maxApplicants: Int = 30,

    @Column(name = "num_applicants", nullable = false)
    var numApplicants: Int = 0,

    @OneToMany(mappedBy = "course", cascade = [CascadeType.ALL], orphanRemoval = true)
    var lectures: MutableList<Lecture> = mutableListOf(),

    @OneToMany(mappedBy = "course", cascade = [CascadeType.ALL], orphanRemoval = true)
    var courseApplications: MutableList<CourseApplication> = mutableListOf()
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}
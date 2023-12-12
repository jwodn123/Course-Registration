package com.teamsparta.courseregistration.domain.course.controller

import com.teamsparta.courseregistration.domain.course.dto.CourseResponse
import com.teamsparta.courseregistration.domain.course.dto.CreateCourseRequest
import com.teamsparta.courseregistration.domain.course.dto.UpdateCourseRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/courses")
@RestController
class CourseController {

    //강의 생성
    @PostMapping
    fun createCourse(@RequestBody createCourseRequest: CreateCourseRequest): ResponseEntity<CourseResponse> {
        TODO("not implemented")
    }

    //강의 목록 조회
    @GetMapping()
    fun getCourseList(): ResponseEntity<List<CourseResponse>> {
        TODO("not implemented")
    }

    //강의 단건 조회
    @GetMapping("/{courseId}")
    fun getCourse(@PathVariable courseId: Long): ResponseEntity<CourseResponse> {
        TODO("not implemented")
    }

    @PutMapping("/{courseId}")
    fun updateCourse(
        @PathVariable courseId: Long,
        @RequestBody updateCourseRequest: UpdateCourseRequest
    ): ResponseEntity<CourseResponse> {
        TODO("not implemented")
    }

    @DeleteMapping("/{courseId}")
    fun deleteCourse(@PathVariable courseId: Long): ResponseEntity<Unit> {
        TODO("not implemented")
    }

}
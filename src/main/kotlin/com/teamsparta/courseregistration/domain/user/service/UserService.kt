package com.teamsparta.courseregistration.domain.user.service

import com.teamsparta.courseregistration.domain.user.dto.*

interface UserService {

    fun signUp(request: SignUpRequest): UserResponse
    fun updateUserProfile(UserId: Long, request: UpdateUserProfileRequest): UserResponse
    fun login(request: LoginRequest): LoginResponse
}
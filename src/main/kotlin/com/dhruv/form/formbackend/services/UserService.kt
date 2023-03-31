package com.dhruv.form.formbackend.services

import com.dhruv.form.formbackend.payloads.UserDTO

interface UserService {

    fun createUser(user: UserDTO): UserDTO
    fun updateUserByID(user: UserDTO, id: Int): UserDTO
    fun getUserByID(id:Int): UserDTO
//    fun getALLUser(): List<UserDTO>
}
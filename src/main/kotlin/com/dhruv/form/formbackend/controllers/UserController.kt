package com.dhruv.form.formbackend.controllers

import com.dhruv.form.formbackend.payloads.UserDTO
import com.dhruv.form.formbackend.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/user")
class UserController {

    @Autowired
    lateinit var userService : UserService

    @PostMapping("/")
    fun createUser(@RequestBody user :UserDTO): ResponseEntity<UserDTO>{
        val saveduser = userService.createUser(user)
        return ResponseEntity<UserDTO>(saveduser,HttpStatus.CREATED)
    }



}
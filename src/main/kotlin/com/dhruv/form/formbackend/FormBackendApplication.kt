package com.dhruv.form.formbackend

import com.dhruv.form.formbackend.payloads.UserDTO
import com.dhruv.form.formbackend.services.UserService
import jakarta.persistence.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class FormBackendApplication

fun main(args: Array<String>) {
	runApplication<FormBackendApplication>(*args)
}

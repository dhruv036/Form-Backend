package com.dhruv.form.formbackend.repository

import com.dhruv.form.formbackend.entities.Users
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepo : JpaRepository<Users,Int> {


}
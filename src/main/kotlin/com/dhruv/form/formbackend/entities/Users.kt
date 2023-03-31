package com.dhruv.form.formbackend.entities

import com.dhruv.form.formbackend.utils.Plan
import jakarta.persistence.*
import java.math.BigInteger

@Entity
@Table(name = "users")
data class Users(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userid", nullable = false)
    var userId: Int,
    @Column(name = "firstname", nullable = false, length = 30)
    var firstname:String,
    @Column(name = "lastname", nullable = true, length = 30)
    var lastname:String,
    @Column(name = "email", unique = true, nullable = false)
    var email:String,
    @Column(name = "countrycode", nullable = true)
    var countrycode:Int,
    @Column(name = "phone", unique = true, nullable = true)
    var phone:BigInteger,
    @Column(name = "plan", nullable = false)
    var plan:Plan,
    @Column(name = "image", nullable = true)
    var image:String,
)

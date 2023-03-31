package com.dhruv.form.formbackend.payloads

import com.dhruv.form.formbackend.utils.Plan
import jakarta.persistence.Column
import jakarta.persistence.Embeddable
import java.math.BigInteger


data class UserDTO (
    val userId: Int,
    val firstname:String,
    val lastname:String,
    val email:String,
    val countrycode:Int,
    val phone: BigInteger,
    val plan: Plan,
    val image:String,
){
}
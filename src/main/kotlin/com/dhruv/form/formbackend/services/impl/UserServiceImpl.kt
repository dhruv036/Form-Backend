package com.dhruv.form.formbackend.services.impl

import com.dhruv.form.formbackend.payloads.UserDTO
import com.dhruv.form.formbackend.repository.UserRepo
import com.dhruv.form.formbackend.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import com.dhruv.form.formbackend.entities.*
import com.dhruv.form.formbackend.exceptions.ResourceNotFoundException
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService{

    @Autowired
    lateinit var userRepo: UserRepo

    override fun createUser(user: UserDTO): UserDTO {
       val saveduser =  this.userRepo.save(dtoToUser(user))
        return this.userToDto(saveduser )
    }

    override fun updateUserByID(updateduser: UserDTO, id: Int): UserDTO {
        var user = userRepo.findById(id).orElseThrow {  ResourceNotFoundException("User","Id",id.toLong())  }

        user.apply {
            firstname = updateduser.firstname
            lastname = updateduser.lastname
            email = updateduser.email
            countrycode = updateduser.countrycode
            phone = updateduser.phone
            plan = updateduser.plan
            image = updateduser.image
        }
        val saveduser = userRepo.save(user)
        return userToDto(saveduser)
    }

    override fun getUserByID(id: Int): UserDTO {
        var user = userRepo.findById(id).orElseThrow {  ResourceNotFoundException("User","Id",id.toLong())  }
        return  userToDto(user)
    }
//
//    override fun getALLUser(): List<UserDTO> {
//
//    }

    private fun dtoToUser( userDto:UserDTO) : Users{
        var user = Users(userDto.userId,userDto.firstname,userDto.lastname,userDto.email,userDto.countrycode,userDto.phone,userDto.plan,userDto.image)
         return user
    }
    private fun userToDto(user: Users): UserDTO{
        val userdto = UserDTO(user.userId,user.firstname,user.lastname,user.email,user.countrycode,user.phone,user.plan,user.image)
        return userdto
    }
}
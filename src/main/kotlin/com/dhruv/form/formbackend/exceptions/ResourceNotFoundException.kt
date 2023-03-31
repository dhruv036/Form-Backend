package com.dhruv.form.formbackend.exceptions


data class ResourceNotFoundException(val resource:String,val fieldname:String,val value:Long) :
    RuntimeException("$resource not found with field $fieldname and value $value") {


}
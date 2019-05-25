package com.example.anketakotlin

data class User(var name: String,var surname: String, var age: Int,var other:String) {
    override fun toString(): String {
        return "User(name='$name', surname='$surname', age=$age, other='$other')"
    }


}
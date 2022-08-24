package com.iyilmaz.fragmenttutorial4.entity

import java.io.Serializable

 class Person(var name: String, var phone: String, var mail: String, var city: String) : Serializable {


     override fun toString(): String {
        return "$name $mail $phone $city"
    }
}
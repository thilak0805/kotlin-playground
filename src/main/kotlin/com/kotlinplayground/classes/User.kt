package org.modules.com.kotlinplayground.classes

// if we remove open identifier, this class cannot be extendable, it cannot be subclassed

open class User(val name : String) {
    open var isLoggedIn : Boolean = false
    // if you want this fun login to be override by subclass, then it should be declared as open, because by default it is final
   open fun login(){
        println("inside user login")
    }
}

// below classes Student and Instructor are extending User class,
// User class has already taking parameter, so in order to accompany that,
// Student needs to add an parameter and pass that name to that User constructor as constructor argument
// here only one class can be a super class

//open class abc{}
// we cannot extend Student class like this class Student(name : String) : User(name), abc, it will compilation issue
class Student(name : String) : User(name) {
    // in this student subclass, kotlin allows to override the function login using override keyword, make sure the function name
    // and method signature are same
   override var isLoggedIn : Boolean = false
    override fun login(){
        println("inside student login")
        // if you need to invoke super class login method, use super keyword here
        super.login()
    }
}

class Instructor(name : String) : User(name)

fun main(){
    val student = Student("Alex")
    println("Student name is : ${student.name}")
    student.login();
    student.isLoggedIn = true
    println("isLogged in value  : ${student.isLoggedIn}")

    val instructor = Instructor("Philip")
    println("instructor name is : ${instructor.name}")

    instructor.login()
}
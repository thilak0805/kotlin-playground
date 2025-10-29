package org.modules.com.kotlinplayground.classes

open class User(val name : String) {
    fun login(){
        println("inside user login")
    }
}

// below classes Student and Instructor are extending User class,
// User class has already taking parameter, so in order to accompany that,
// Student needs to add an parameter and pass that name to that User constructor as constructor argument
// here only one class can be a super class

//open class abc{}
// we cannot extend Student class like this class Student(name : String) : User(name), abc, it will compilation issue
class Student(name : String) : User(name)

class Instructor(name : String) : User(name)

fun main(){
    val student = Student("Alex")
    println("Student name is : ${student.name}")
    student.login();

    val instructor = Instructor("Philip")
    println("instructor name is : ${instructor.name}")

    instructor.login()
}
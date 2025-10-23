package org.modules.com.kotlinplayground.basics

import org.modules.com.kotlinplayground.functions.courseName
import org.modules.com.kotlinplayground.functions.topLevelFunction

fun main(){
    //immutable
    val name : String = "Daya"

    println(name)

    //mutable
    var age : Int =34

    println(age)

    age = 35
    println(age)

    //kotlin has the concept of type inference, even release that feature in java11 LVTI
    //val salary : Long = 30000L

    val salary = 30000L
    println(salary)

    val course = "Kotlin Spring"

    //below concept is called string interpolation or string templates
    println("course : $course and the course length is ${course.length}")

    //multi line
    val multiline = "ABC \n DEF"

    println(multiline)

    val multiline1 = """
        ABC
        DEF
        """.trimIndent()
    println(multiline1)

    val num = topLevelFunction()
    println("Num is $num")
    println("Constant name is $courseName")

}
package org.modules.com.kotlinplayground.classes

// Data classes are primarily classes thats going to behave as a data container
// it autogenerates lots of functionalities when you add data modifier to the class
// Benefits: if you are firing query against sql db and store the results from the query to the kotlin, use data class
// while building restful services, you have dto that can be used as controller layer then you can use dataclass as dto
data class Course(
    val id : Int,
    val name : String,
    val author : String
)

fun main(){
    val course = Course(1,"Kotlin","Daya")
// if need to print meaningful output value, we need to use data class
    // same println is used on Item class, which is normal class it prints some garbage values
    println("course value is :$course")

    val course1 = Course(2, "Kotlin", "Daya")
    println(" checking object equivality : ${course==course1}")

    // copy properties that part of data class
    // this copy is equivalent to cloning the object, you can clone the object so that
    // you cannot disturb the original object at all
    var course3 = course1.copy(id=3,author = "kumar")
    println("course3 value is :${course3}")
}

package org.modules.com.kotlinplayground.classes

class Person {
    fun action(){
        println("Person Walks")
    }
}

fun main(){
    // creating the instance of person class, no need to use new keyword to create an instance of the classk
    val person = Person()
    person.action()
}
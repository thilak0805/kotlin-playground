package org.modules.com.kotlinplayground.classes

/*class Person {
    fun action(){
        println("Person Walks")
    }
}*/

class Person(val name : String = "",
    val age : Int = 0) {
    fun action(){
        println("Person Walks")
    }
}

fun main(){
    // creating the instance of person class, no need to use new keyword to create an instance of the class
    //in java we normally use getters and setters to access the properties, but in kotlin you can access the properties as fields
    val person = Person("Daya", 26)
    person.action()
    println("Name : ${person.name} and the Age is : ${person.age}")

    // if you want to create the instance of the person class without passing the name and age, it is possible by using the default values concept
    // in the person constructor declaration, we can add that, if the name is passed we take values otherwise we provide default values for that parameter
    // its a kind of overloaded constructor, if we pass value it will take it, otherwise it will take default value
    val person1 = Person()
    println("Default Name : ${person1.name} and the Default Age is : ${person1.age}")

}
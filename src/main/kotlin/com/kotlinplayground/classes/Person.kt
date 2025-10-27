package org.modules.com.kotlinplayground.classes

/*class Person {
    fun action(){
        println("Person Walks")
    }
}*/

class Person(val name : String = "",
    val age : Int = 0) {

    // secondary constructor to pass email
    // while printing, since we are able to print only email, we need to print name,age. inorder to initialize the default constructor
    // person, we are using 'this' keyword to initialize name and age
    var email : String = ""
    constructor(_email : String,
        _name : String ="",
        _age : Int = 0) :this(_name, _age) {
        email = _email

    }
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

    // here we are using named parameter concept to invoke the constructor which is having email parameter
    val person2 = Person(_email = "abc@gmail.com","Alex",25)
    println("person2  Name : ${person2.name}  and the person2 Age is : ${person2.age}" +
            "and the person2 email is :${person2.email}")

}
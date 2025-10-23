package org.modules.com.kotlinplayground.functions

import java.time.LocalDate

fun main(){
   val unit =  printname("daya")
    println("Unit is : $unit")
    val result = addition(1, 2)
    println("Result is $result")
    val result1 = addition_approach1(1, 2)
    println("Result1 is $result1")

    //default parameter
    printPersonDetails("Daya","abc@email.com", LocalDate.parse("1983-05-08"))
    printPersonDetails("Daya1")

    //named parameters
    printPersonDetails(name="Daya2",dob=LocalDate.parse("2025-08-01"))
    printPersonDetails(dob=LocalDate.parse("2025-08-01"), name="Daya3",email="abc@gmail.com")


}

// after paranthesis : Int is the return type in function declaration
fun addition(x: Int, y: Int) : Int {
    return  x+y
}

// since we have one single stmt, we can return in below way, we can express the function as expression
// below uses type inference, the return type is inferred based on the operation say addition x+y

fun addition_approach1(x: Int, y: Int) = x+y

// or

fun addition_approach2(x: Int, y: Int) : Int  = x+y


// name : String | name = variable, String = type
// if we use Unit, it says the function is not returning anything, Unit is equivalent to void in java
// if any function that does not return anything then we can use Unit as return type
fun printname(name: String): Unit{
    println("name is :$name")
}

//default parameters
fun printPersonDetails(
    name : String,
    //if the email and dob is not passed, a default value is assigned
    email :String = "",
    dob: LocalDate = LocalDate.now()
){
    println("Name is $name and email is $email and dob is $dob")
}

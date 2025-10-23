package org.modules.com.kotlinplayground.functions

const val courseName = "Kotlin Programming"

fun topLevelFunction() : Int{
    return (0..1).random()
}
fun main(){
    val num = topLevelFunction()
    println("Num is $num")
}
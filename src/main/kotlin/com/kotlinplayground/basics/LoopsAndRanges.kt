package org.modules.com.kotlinplayground.basics

fun main(){
   /* val range = 1..10;

    for(i in range){
        println("i : $i")
    }

    //reverse range using downTo

    val reverseRange = 10 downTo 1
    for(i in reverseRange){
        println("reverseRange : $i")
    }

    //skip values
    for(i in reverseRange step 2){
        println("reverseRange with step : $i")
    }*/

    //while and do while

    exploreWhile()
    exploreDoWhile()

}

fun exploreDoWhile() {
   var i = 0
    do {
        println("i value is inside dowhile loop: $i")
        i++
    }while(i<5)
}

fun exploreWhile(){

    var x = 1
    while(x < 5) {
        println("value of x is :$x")
        x++
    }

}
package org.modules.com.kotlinplayground.basics

fun main(){
    //if-else in kotlin is an expression

    var name = "Alex"
    name = "chloe"
    val result = if(name.length == 4){
        println("name is four char")
        name.length
    }else{
        println("name is not four char")
        name.length

    }
//Unit is a special type in kotlin which represents no value
    println("result : $result");

    var position  = 1;
    position = 2;
    //below code is like verbose, having multiple statements
    var medal = if(position == 1){
        "GOLD"
    } else if(position == 2){
        "SILVER"
    } else if (position == 3){
        "BRONZE"
    } else{
        "No Medal"
    }

    //when block
    var medal1 = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "No Medal"
    }

    println(medal)


    println(medal1)
}
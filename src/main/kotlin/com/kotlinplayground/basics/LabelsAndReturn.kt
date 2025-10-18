package org.modules.com.kotlinplayground.basics

fun main(){
    //break stmt
    for(i in 1..5){
        println(" i in $i")
        if(i==3) break
    }

    //label

    label()

    for(i in 1..5){
        println(" i in return  $i")
        if(i==3) return
    }

    println("end of the program")
}

fun label() {
    //label statment loop@
    loop@ for(i in 1..5){
        println(" i in label  $i")
       // if(i==3) break@loop
        innerloop@ for(j in 1..5){
            println(" j in label  $j")
            //if(j==2) break@innerloop
            if(j==2) continue@loop
        }
    }
}

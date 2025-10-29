package org.modules.com.kotlinplayground.classes
// class item does not take any parameter for constructor, instead it creates secondary constructor

class Item() {

    // we can override so we are using var, if you use val, we cannot override
    var name : String = ""
    var price : Double = 0.00

    //generating getters
    //get() = field
// when you use get(), you can access the actual values of the fields using concept called packing field in kotlin
// second type of declaring getters
        get(){
            //lets add some println stmt, so that when we print any field say 'price' getters will also be accessed
            println("inside getter")
            return field
        }
 // setter , normally doesn't return anything, when you use setter we can do some validations
 set(value){
     if(value > 0.0){
         println("inside setter")
         field = value
     }else{
         //while throwing exception, we will not use new keyword in kotlin
         throw IllegalArgumentException("negative price is not allowed")
     }
 }

    // secondary constructor, we are calling this() keyword and call default constructor which doesn't take any value
    constructor(_name : String) : this(){
        name  = _name
    }
}

fun main(){
    // below item parameter by default takes _name , means it resolves to the above constructor and calls it
    val item  = Item("_Iphone")
    println("item name is ${item.name}")
    item.name = "Iphone13"
    println("item name is ${item.name}")

   // println("item value is :$item")
    // getter called here
    println("item price is ${item.price}")
    // invoking setter
    item.price = - 9.0
}
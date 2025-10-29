package org.modules.com.kotlinplayground.classes
// class item does not take any parameter for constructor, instead it creates secondary constructor
class Item() {

    // we can override so we are using var, if you use val, we cannot override
    var name : String = ""

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

    println("item value is :$item")
}
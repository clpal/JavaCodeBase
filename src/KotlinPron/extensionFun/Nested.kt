package KotlinPron.extensionFun
class Outer{
    val name:String="chhhote"
    fun method1(){

        println("Nested method ")
    }
class Nested {
    //val name:String=Outer.name
    // we can not use outer variable/method in nested class
    //Outer().method1()
    fun method(){

        println("Nested method ")
    }
}
}

fun main() {
    Outer.Nested().method()
    Outer().name
}
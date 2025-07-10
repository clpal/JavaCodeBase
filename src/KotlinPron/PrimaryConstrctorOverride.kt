package KotlinPron.extensionFun
// Primary Construcor overriding
open class Parent(x: Int){

}
class  Child(x:Int):Parent(x){
    init {
        println(x)
    }
}

fun main() {
    Child(2)
}
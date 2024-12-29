package KotlinPron.extensionFun
// constructor overloadding
class Test {
    constructor(){
        println("How are you !!")
    }
    constructor(x:Int){
        println(x)
    }
}

fun main() {
    Test()
    Test(12)
}
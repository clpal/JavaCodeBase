package KotlinPron.extensionFun.InfixExample

class Test {
   infix  fun  method(x:Int){
         println(x)
     }
}

fun main() {
 var aa= Test()
    aa method 12
}
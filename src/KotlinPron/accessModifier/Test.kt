package KotlinPron.extensionFun.accessModifier

fun main() {
 val sum=  fun (a:Int,b:Int):Int=a +b
val sum1={a:Int,b:Int->a*b}
   val sum2:(Int,Int)->Int = {a:Int,b:Int->a+b}
   val sum3:(Int,Int)->Int = {a,b->a+b}
   println( sum1(1,2))
   println( sum2(1,2))
   println( sum3(1,2))
}


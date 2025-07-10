package KotlinPron.extensionFun

fun main() {





 /*   display data@ {
   // println(" Before Return ")
  //  33
    //return@display 33
    return@data 33
}*/
    var data={a:Int,b:Int->a+b}
    val result= sum(12,33,data)
    println(result)
}
fun sum(x:Int,y:Int, add:(Int,Int)->Int):Int=add(x,y)


fun  display(dis:()->Int){
    val res=dis()
    println("Return the value $res")

}
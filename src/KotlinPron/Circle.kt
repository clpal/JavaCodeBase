package KotlinPron.extensionFun

class Circle (val r: Int){
    fun  area ():Double{
         return  Math.PI*r*r

    }
}
  fun Circle.perimeter(): Double{
     return 2*Math.PI*r
}
fun String.find(values:Int):Char{
 return this [values]
}
fun String.find1(values:Int):Char = this [values]



fun main() {
    val  circle= Circle(2)

  //  println(circle.area())
    //println(circle.perimeter())
    println("chhote".find(5))
}
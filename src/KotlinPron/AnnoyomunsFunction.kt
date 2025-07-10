package KotlinPron.extensionFun

fun main() {
    // Local function
    fun display(x:Int,y:Int){
        val z=x+y
        println(z)

    }
    display(6,5)
    // Annoymouneud function
   val data= fun (x:Int,y:Int){
        val z=x+y
        println(z)

    }
    data(6,5)
}
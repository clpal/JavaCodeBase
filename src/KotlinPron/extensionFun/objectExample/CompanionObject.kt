package KotlinPron.extensionFun.objectExample

class CompanionObject {
     fun nonstatic(){
         println("Non static method")
     }
    companion object {
        // static method calling
        fun static(){
            println("static method")
        }
    }
}

fun main() {
    CompanionObject.static()
    CompanionObject().nonstatic()
}
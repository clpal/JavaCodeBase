package KotlinPron.extensionFun.objectExample
object ObjectExam {
    fun method():Int{
        print("Object class method calling")
        return  1
    }
}

fun main() {
    print( ObjectExam.method())
}
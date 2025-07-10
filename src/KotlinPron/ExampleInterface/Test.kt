package KotlinPron.extensionFun.ExampleInterface


interface Animal {
    fun sound()
    fun disp(){
println("Interface")
    }
}
class Dog :Animal {
    override fun sound() {
        println("Woooo")
    }

}

fun main() {
    Dog().sound()
    Dog().disp()
}
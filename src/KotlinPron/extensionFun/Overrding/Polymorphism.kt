package KotlinPron.extensionFun.Overrding



open class Parent{

    open  fun property(){
        println("Parent Properties")
    }
}
class  Child :Parent(){
    override fun property() {
        super.property()
        println("Child Properties")

    }
}

fun main() {
    var child=Child()
    child.property()
}
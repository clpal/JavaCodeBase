package KotlinSample.extensionfuncton

fun main() {
    val list= mutableListOf(12,45,55,4,21)
    list.swap(0,3)
    println(list)
}


fun MutableList<Int >?.swap(first:Int,second:Int):Any{
    return if (this==null)
        "null"
    else{
        var temp=this[first]
        this[first]= this[second]
        this [second]=temp
        return this
    }
}
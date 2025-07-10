package KotlinPron.extensionFun

class ExtensionCompanion {
    companion object{

    }
}
fun ExtensionCompanion.Companion.example(){
    print("Extension function with companion object")
}
fun main() {
   print( ExtensionCompanion.example())

}
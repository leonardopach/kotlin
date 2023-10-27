package fundamentos
// static final
const val PI = 314159;

fun main() {

    // variable mutable
    var name: String = "leonardo pacheco"
    name = "lucas"

    // variable immutable
    val age: Byte = 25 // final
    println("$name $age")

    println(PI)
}
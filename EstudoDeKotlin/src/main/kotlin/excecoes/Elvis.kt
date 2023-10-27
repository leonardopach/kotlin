package excecoes

fun main() {

    val str: String? = null

    println(str ?: message())
}

fun message(): String {
    return "Nullo"
}
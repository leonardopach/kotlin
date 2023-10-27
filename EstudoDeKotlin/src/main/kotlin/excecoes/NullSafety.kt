package excecoes

fun main() {

    val s: String? = null
    // logico
    // ? e para o kotlin tratar
    println(s?.length)

    // !! e para o programador tratar
    println(s!!.length)

}
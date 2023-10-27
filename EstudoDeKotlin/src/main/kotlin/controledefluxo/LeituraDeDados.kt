package controledefluxo

fun main() {
    val entrada: String? = readlnOrNull()

    if(entrada != null && entrada != ""){
        entrada.toInt()
    }
    println(entrada)
}
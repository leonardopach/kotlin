package funcoes

fun <T : Number, J> media(abc: J, vararg notas: T): Float {
    var soma: Float = 0f
    for (n in notas) {
        soma += n.toFloat()
    }

    println(abc)
    return soma / notas.size
}

fun main() {
    println(media(1, 2, 3, 4, 5))
}
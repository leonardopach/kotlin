package funcoes


fun main() {
    println(media(10f,2.3f,3.5f,4.2f,5.5f,6.25f,7.3f))
}
fun media(vararg notas: Float): Float {
    var soma: Float = 0f
    for (n in notas) {
        soma += n
    }

    return soma / notas.size
}
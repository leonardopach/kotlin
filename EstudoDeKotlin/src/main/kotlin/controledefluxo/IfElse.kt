package controledefluxo

fun maiorDeIdade(idade: Byte) {
    if (idade > 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }
}
fun saudacao(dia:Boolean): String {
    return if (dia) {
        "Bom dia"
    } else {
        "Boa noite"
    }
}

fun main() {
    val num: Byte = 30
    val dia: Boolean = false

    if (num > 20) {
        println("Numero maior que 20")
    }

    maiorDeIdade(num)
    println( saudacao(dia))
}

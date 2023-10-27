package controledefluxo

fun bonusWhen(cargo: String): Float {
    return when (cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de software" -> 1000f
        "Estagiário" -> 500f
        else -> 0f
    }
}

fun main() {

    println(bonusWhen("Gerente"))
    println(bonusWhen("Coordenador"))

    val n = 10
    when (n) {
        in 1..10 -> println("1..10")
        else -> println("Erro")
    }
}
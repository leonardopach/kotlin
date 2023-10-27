package orientacaoobjetos

class Animal(private var especie: String) {
    private var fala: String? = null

    init {
        fala = when {
            (especie == "cachorro") -> "Woof"
            (especie == "gato") -> "Miaurr"
            else -> ""
        }
    }

    fun falar() {
        println(fala)
    }
}

fun main() {

    Animal("cachorro").falar()
    Animal("gato").falar()
}
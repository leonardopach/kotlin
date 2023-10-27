package orientacaoobjetos

interface selvagem {
    fun atacar()
}

abstract class Mamifero1(val nome: String) {
    fun acordar() {}
    fun dormir() {}

    abstract fun falar()
}

class cachorro1(nome: String) : Mamifero1(nome), selvagem {
    override fun falar() {
        TODO("Not yet implemented")
    }

    override fun atacar() {
        TODO("Not yet implemented")
    }

}

fun main() {

}
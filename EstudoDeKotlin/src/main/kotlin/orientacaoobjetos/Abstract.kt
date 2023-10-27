package orientacaoobjetos

abstract class Mamifero(val nome: String) {
    fun acordar() {}
    fun dormir() {}

    abstract fun falar()
}

class cachorro(nome: String) : Mamifero(nome) {
    override fun falar() {
        TODO("Not yet implemented")
    }

}

fun main() {

}
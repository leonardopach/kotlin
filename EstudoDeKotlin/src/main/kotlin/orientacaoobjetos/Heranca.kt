package orientacaoobjetos

open class Eletronico(private var marca: String) {
    protected fun energia() {}
    private fun ativarCorrente() {
    }

    fun ligar() {
        ativarCorrente()
    }

    fun desligar() {}
}

class Computador(marca: String) : Eletronico(marca) {
    fun instalarSoftware() {}
    fun processar() {
        energia()
    }
}

fun main() {

    val c: Computador = Computador("DELL")

    c.ligar()
    c.desligar()
}
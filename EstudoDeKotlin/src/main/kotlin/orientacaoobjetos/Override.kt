package orientacaoobjetos

open class Eletronico1(var marca: String) {
    private fun corrente(ativo: Boolean) {}
    fun ligar() {
        corrente(true)
    }

    open fun desligar() {
        corrente(false)
    }
}

class Computador1(marca: String) : Eletronico1(marca) {
    private fun save() {}

    override fun desligar() {
        save()
        super.desligar()
    }
}

fun main() {

    val c: Computador1 = Computador1("Dell")

    println(c.ligar())
    println(c.desligar())
    println(c.marca)
}
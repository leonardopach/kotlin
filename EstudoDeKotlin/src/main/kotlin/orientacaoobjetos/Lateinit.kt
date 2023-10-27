package orientacaoobjetos

class Receita {
    lateinit var instrucoes: String

    fun gerarReceita() {
        instrucoes = "Lave as mãos"
    }

    fun imprimirReceita() {
        if (!this::instrucoes.isInitialized)
            instrucoes = "Lave as mãos"
    }
}

fun main() {
    val r = Receita()
    r.imprimirReceita()

    println(r.instrucoes)
}
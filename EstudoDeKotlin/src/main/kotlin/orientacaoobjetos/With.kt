package orientacaoobjetos

fun main() {

    val pessoaCriadaParaExecucaoDeTeste = Pessoa(1997, "Pedro")
    with(pessoaCriadaParaExecucaoDeTeste) {
        println(dormir())
        println(acorda())
    }
}
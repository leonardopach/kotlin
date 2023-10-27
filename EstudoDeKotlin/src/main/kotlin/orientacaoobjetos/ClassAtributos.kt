package orientacaoobjetos

class Pessoa(val anoNascimento: Int, var nome: String) {

    var doc: String? = null

    constructor(anoNascimento: Int, nome: String, doc: String) : this(anoNascimento, nome) {
        this.doc = doc
    }

    var olhos: String = "verde"
    fun dormir(): String {
        return "$nome dorme"
    }

    fun acorda(): String {
        return "$nome acorda"
    }
}

fun main() {
    val pessoa: Pessoa = Pessoa(2000, "Pedro")

    println(pessoa.olhos)
    println(pessoa.dormir())
    println(pessoa.acorda())
}
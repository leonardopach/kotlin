package excecoes

fun main() {

    val str: String? = null

    str?.let {
        it.uppercase()
        it.length
        message1()
    }

    val nome: String? = "joão"

    nome?.let {
        val comprimento = it.length // 'it' se refere ao objeto não nulo
        println("O comprimento do nome é $comprimento")
    }
}

fun message1() {
    println("Olha mundo")
}
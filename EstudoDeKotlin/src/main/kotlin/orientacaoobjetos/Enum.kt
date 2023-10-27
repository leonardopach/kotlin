package orientacaoobjetos

enum class Prioridade(val value: Int) {
    Baixo(1) {
        override fun toString(): String {
            return "Prioridade ${super.toString()}: $value"
        }
    },
    Media(5),
    Alta(15)
}

enum class AnimalEnum {
    Cachorro, Gato, Cavalo, Vaca
}

fun main() {

    for (p in Prioridade.entries) {
        println(p)
    }
}
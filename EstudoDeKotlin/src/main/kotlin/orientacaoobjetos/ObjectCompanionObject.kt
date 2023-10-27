package orientacaoobjetos

class Matematica {

    // Static
    companion object {
        const val PI: Float = 3.1415f
        fun teste() {}
    }

    object obj1 {
        const val PI: Float = 3.1415f
    }
}

fun main() {
    println( Matematica.PI)
    println( Matematica.teste())
    val m: Matematica = Matematica()

    println(Matematica.obj1.PI)
}
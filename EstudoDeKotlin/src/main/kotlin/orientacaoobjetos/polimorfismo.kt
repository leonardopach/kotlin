package orientacaoobjetos

interface Funcionario {
    var salario: Float
    fun bonus(): Float
}

class Gerente(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.5f
    }
}

class Analista(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.3f
    }
}

fun <T: Funcionario>mostrarBonus(func: T) {
    println(func.bonus())
}
fun main() {

    mostrarBonus(Gerente(5000f))
    mostrarBonus(Analista(4000f))
}
package orientacaoobjetos

class Animal2(var especie: String) {
    var fala: String? = null
}


fun main() {

    val animal: Animal2 = Animal2("cachorro")
    animal.fala = "Woof"
    println(animal.fala)
}
package fundamentos

fun main() {
    val name1 = "Saleh"
    val name2 = "Silva"
    val name3 = String("Saleh".toCharArray())

    println(name1 == name3)
    println(name1 === name3)
    println(name1.equals(name3))
}
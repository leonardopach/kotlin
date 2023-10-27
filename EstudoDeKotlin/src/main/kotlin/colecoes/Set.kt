package colecoes

fun main() {
    val set1: Set<Int> = setOf<Int>(1,2,3,4,5)
    println(set1)
    val set2: MutableSet<Int> = mutableSetOf<Int>(1,2,3,4,5)
    println(set2)

    set2.add(10)
    set2.remove(2)
    println(set2)
}
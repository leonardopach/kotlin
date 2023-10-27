package colecoes

fun main() {

    val list1: List<Int> = listOf(1, 2, 3, 4, 5)
    println(list1)
    val list2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    list2[2] = 10
    println(list2)
    println(list2.size)

    list2.add(19)
    list2.remove(5)
    list2.removeAt(0)
    println(list2)
}
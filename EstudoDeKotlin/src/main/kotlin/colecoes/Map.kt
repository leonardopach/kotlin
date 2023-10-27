package colecoes

fun main() {

    val map1: Map<Int, String> = mapOf(Pair(1, "Leonardo"), Pair(2, "Pedro"), Pair(3, "Silva"))

    for((k,v) in map1.iterator()) {
        println("$k - $v")
    }
    println(map1)
}
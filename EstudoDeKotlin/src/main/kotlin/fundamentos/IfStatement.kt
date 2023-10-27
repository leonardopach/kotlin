package fundamentos

fun main() {
    val n1 = 30
    val n2 = 20

    if (n1 > n2) {
        println(n1)
    } else {
        println(n2)
    }
    val value = if (n1 >= n2 || n1 <= 30) {
        println("True")
        ":)"
    } else {
        println("False")
        ":("
    }

    println(value)
}
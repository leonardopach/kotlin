package funcoes

fun main() {
    val a = { println("Hello") }
    a()
    receiveA(a)

    val b = { x: Int -> x * x }
    println(b(10))
    val d = receiveB({ x: Int -> x / x }, 10)
    println(d)

    val c = { x: Int, y: Int -> x * y }
    println(c(10, 2))
}

fun receiveA(lambda: () -> Unit) {
    lambda()
}

fun receiveB(lambda: (x: Int) -> Int, y: Int): Int {
    return lambda(y)
}
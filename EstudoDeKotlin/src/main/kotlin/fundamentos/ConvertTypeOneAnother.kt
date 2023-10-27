package fundamentos


fun main() {
    val number = "10"
    println(number::class.simpleName)
    println(10 + number.toInt())
    val number2 = 10
    println(number2.toString() + number2)
}
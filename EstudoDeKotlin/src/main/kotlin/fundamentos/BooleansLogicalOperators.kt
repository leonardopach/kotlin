package fundamentos

fun main() {
    val isAdult = false
    val isMale = true
    val isOrderCompleted: Boolean? = null
    println(isAdult)
    println(isMale)
    println(isOrderCompleted)

    println(isAdult && isMale)
    println(isAdult || isMale)
    println(!isAdult)
}
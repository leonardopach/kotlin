package fundamentos

fun main() {

    val input = "M"
    val n1 = 31
    val n2 = 20

    val gender = when (input) {
        "F" -> "FEMALE"
        "M" -> "MALE"
        else -> {
            "Unknown Gender"
        }
    }

    println(gender)

    when {
        (n1 >= n2 || n1 <= 30) -> println(":)")
        (n1 == 100) -> println("foo")
        (n1 == 100) -> println("foo")
        (n1 == 100) -> println("foo")
        else -> println(":(")
    }
}
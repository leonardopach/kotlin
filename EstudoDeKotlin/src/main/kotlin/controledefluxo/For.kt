package controledefluxo

fun main() {
    for (i in 1..10 step 2) {
        print("$i ")
    }

    println()
    for (i in 20 downTo 0) {
        print("$i ")
    }

    println()
    val s = "Kotlin e delicinha"
    for (char in s) {
        print("$char")
    }
}
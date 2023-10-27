package fundamentos

fun main() {
    val name: String = "Leonardo"
    println(name.uppercase())
    println(name.lowercase())
    println(name.length)
    println(name[0])
    println(name[4])
    println("".isEmpty())

    val age = 22
    println("$name $age")

    val email = """
        Hello %s
            How
        Are you
    """.trimIndent()

    println(
        email.format(
            name
        )
    )
}
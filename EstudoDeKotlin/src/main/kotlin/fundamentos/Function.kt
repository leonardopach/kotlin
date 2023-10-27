package fundamentos

fun main() {

    val valor = plus(10, 20)
    println(valor)
    message()
    val greeting = birthdayGreeting("Roberto", 5)
    println(greeting)
    println(birthdayGreeting())
}

fun plus(n1: Int, n2: Int): Int {
    return n1 + n2
}

fun birthdayGreeting(name: String = "leonardo", age: Byte = 25): String {
    val nameGreeting = "Harry Birthday, $name!"
    val ageGreeting = "You are now $age year old!"

    return "$nameGreeting\n$ageGreeting"
}

fun message(): Unit {
    val msg = """
        Os parámetros são as variáveis que a 
        função pode acessar, por exemplo, uma variável name, enquanto os argumentos sãos
        os valores reais que você transmite, por exemplo, a string 'Rover'
    """.trimIndent()
    println(msg)
}
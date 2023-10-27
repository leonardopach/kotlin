package fundamentos

fun main() {
    /*
    String (pode armazenar textos de tamanho variável).
    byte (pode armazenar números inteiros de -128 a 127).
    int (pode armazenar números inteiros no intervalo de -2147483648 a 2.147483647).
    long (pode armazenar números inteiros no intervalo de -9223372036854775808 a 9223372036854775807).
    float (pode armazenar números decimais de precisão simples).
    double (pode armazenar números decimais de precisão dupla).
    boolean (pode armazenar valores booleanos, ou seja, true ou false).
     */

    val completeName = "Leonardo pacheco dos santos"

    println(completeName)

    val age: Byte = 25
    val nome: String = "leonardo"
    println(age)
    println(nome)

    val numberInt: Int = 2147483647
    val numberLong: Long = 9223372036854775807L
    val numberFloat: Float = 2.12321F
    val numberDouble: Double = 2.12341234123123
    val string: String = "Leonardo"
    val b: Boolean = false
    val c: Char = 'A'

    println("Double MAX ${Double.MAX_VALUE} - Min ${Double.MIN_VALUE}")
    println("Float MAX ${Float.MAX_VALUE} - Min ${Float.MIN_VALUE}")
    println("Long MAX ${Long.MAX_VALUE} - Min ${Long.MIN_VALUE}")
    println("Int MAX ${Int.MAX_VALUE} - Min ${Int.MIN_VALUE}")
    println("Short MAX ${Short.MAX_VALUE} - Min ${Short.MIN_VALUE}")
    println("Byte MAX ${Byte.MAX_VALUE} - Min ${Byte.MIN_VALUE}")

    // Any

    val name: Any = "Roberto"
    println("$name")
}
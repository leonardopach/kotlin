package funcoes

fun main() {
    helloworld()
    println("A soma de 10 e 5 = ${sum(10, 5)}")

    println("A divisao de 10 e 2 = ${divisao(10f, 2f)}")

}

fun divisao(a: Float, b: Float) = a / b

fun sum(a: Int, b: Int): Int = (a + b)

fun helloworld(): Unit = println("Hello, World!!")
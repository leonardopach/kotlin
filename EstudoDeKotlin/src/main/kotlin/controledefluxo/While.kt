package controledefluxo

fun ex1() {
    var soma = 0;
    for (i in 1..500) {
        soma += i
    }

    println(soma)
}
fun ex2(n: Int) {

    for( i in 1..n) {
        for (j in 1..i) {
            print("#")
        }
        println()
    }
}
fun main() {
    val s: String = "Kotlin"
    var i: Int = 0
    while(i < s.length) {
        print("${s[i]}")
        i++
    }

    println()
    ex1()
    ex2(5)
}
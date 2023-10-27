package excecoes

fun main() {
    try {
        val s: String? = null
        println(s!!.length)
        val a = 10/0
    } catch (e: NullPointerException) {
        println("${e.message}")
    } catch (e: ArithmeticException) {
        println("${e.message}")
    } finally {
        println("Foi")
    }
}
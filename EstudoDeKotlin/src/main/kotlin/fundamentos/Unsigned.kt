package fundamentos

fun main() {

    // Unsigned

    println("ULong MAX - ${ULong.MAX_VALUE} - ${ULong.MIN_VALUE}")
    println("UInt MAX - ${UInt.MAX_VALUE} - ${UInt.MIN_VALUE}")
    println("UShort MAX - ${UShort.MAX_VALUE} - ${UShort.MIN_VALUE}")
    println("UByte MAX - ${UByte.MAX_VALUE} - ${UByte.MIN_VALUE}")

    val abc: UInt = 2u
    val short: UShort = 10u
    val byte: UByte = 10u
    val long: ULong = 10u

    println("$abc $short $byte $long")

}
package algoritmos.grupo050a059.algoritmo58

import kotlin.math.*

fun main() {
    print("Digite xnum1: ")
    val xnum1 = readln().trim().replace(',', '.').toDouble()
    print("Digite xnum2: ")
    val xnum2 = readln().trim().replace(',', '.').toDouble()
    print("Digite xnum3: ")
    val xnum3 = readln().trim().replace(',', '.').toDouble()
    if (xnum3 + xnum1 == 0.0) {
        println("O denominador não pode ser zero.")
        return
    }
    val x = xnum1 + xnum2 / (xnum3 + xnum1) + 2 * (xnum1 - xnum2) + ln(64.0) / ln(2.0)
    println("X: $x")
}

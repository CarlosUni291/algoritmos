package algoritmos.grupo150a159.algoritmo159

import kotlin.math.*

fun main() {
    print("Digite x: ")
    val x = readln().trim().replace(',', '.').toDouble()
    if (x > 4 || x < -4) println("f(x): ${(5 * x + 3) / sqrt(x * x - 16)}")
    else println("NÃO PODE SER FEITA")
}

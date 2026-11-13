package algoritmos.grupo070a079.algoritmo77

import kotlin.math.*

fun main() {
    print("Digite a: ")
    val a = readln().trim().replace(',', '.').toDouble()
    print("Digite b: ")
    val b = readln().trim().replace(',', '.').toDouble()
    val diferenca = (a - b).pow(2)
    val quadrados = a.pow(2) - b.pow(2)
    println("Quadrado da diferença: $diferenca")
    println("Diferença dos quadrados: $quadrados")
}

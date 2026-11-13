package algoritmos.grupo050a059.algoritmo52

import kotlin.math.*

fun main() {
    print("Digite lado: ")
    val lado = readln().trim().replace(',', '.').toDouble()
    println("Perímetro: ${4 * lado}")
    println("Área: ${lado * lado}")
    println("Diagonal: ${lado * sqrt(2.0)}")
}

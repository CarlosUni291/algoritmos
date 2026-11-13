package algoritmos.grupo050a059.algoritmo51

import kotlin.math.*

fun main() {
    print("Digite raio: ")
    val raio = readln().trim().replace(',', '.').toDouble()
    println("Perímetro: ${2 * PI * raio}")
    println("Área: ${PI * raio * raio}")
}

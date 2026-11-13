package algoritmos.grupo050a059.algoritmo50

import kotlin.math.*

fun main() {
    print("Digite base: ")
    val base = readln().trim().replace(',', '.').toDouble()
    print("Digite altura: ")
    val altura = readln().trim().replace(',', '.').toDouble()
    val perimetro = 2 * (base + altura)
    val area = base * altura
    val diagonal = sqrt(base * base + altura * altura)
    println("Perímetro: $perimetro")
    println("Área: $area")
    println("Diagonal: $diagonal")
}

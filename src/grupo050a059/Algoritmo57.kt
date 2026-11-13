package algoritmos.grupo050a059.algoritmo57

import kotlin.math.*

fun main() {
    print("Digite pr1: ")
    val pr1 = readln().trim().replace(',', '.').toDouble()
    print("Digite pr2: ")
    val pr2 = readln().trim().replace(',', '.').toDouble()
    val media = (pr1 + pr2) / 2
    println("Média truncada: ${media.toInt()}")
    println("Média arredondada: ${floor(media + 0.5).toInt()}")
}

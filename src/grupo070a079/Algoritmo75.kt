package algoritmos.grupo070a079.algoritmo75

import kotlin.math.*

fun main() {
    print("Digite peso: ")
    val peso = readln().trim().toInt()
    val gramas = peso * 1000
    val novoPeso = gramas * 1.12
    println("Peso em gramas: $gramas")
    println("Novo peso em gramas: ${round(novoPeso).toInt()}")
}

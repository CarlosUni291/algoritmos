package algoritmos.grupo090a099.algoritmo93

import kotlin.math.*

fun main() {
    print("Digite numero: ")
    val numero = readln().trim().replace(',', '.').toDouble()
    if (numero > 0) println("Raiz: ${sqrt(numero)}")
    else if (numero < 0) println("Quadrado: ${numero * numero}")
}

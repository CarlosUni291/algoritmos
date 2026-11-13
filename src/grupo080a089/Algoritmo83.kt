package algoritmos.grupo080a089.algoritmo83

import kotlin.math.*

fun main() {
    print("Digite numero: ")
    val numero = readln().trim().replace(',', '.').toDouble()
    if (numero > 0) println("Inverso: ${1 / numero}")
    else println("Absoluto: ${abs(numero)}")
}

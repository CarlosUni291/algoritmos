package algoritmos.grupo110a119.algoritmo115

import kotlin.math.*

fun main() {
    print("Digite x: ")
    val x = readln().trim().replace(',', '.').toDouble()
    print("Digite y: ")
    val y = readln().trim().replace(',', '.').toDouble()
    if (x == y) {
        println("Números iguais")
    } else {
        val maior = if (x > y) x else y
        val menor = if (x < y) x else y
        println("Quadrado do menor: ${menor * menor}")
        if (maior >= 0) println("Raiz quadrada do maior: ${sqrt(maior)}")
        else println("O maior número não possui raiz quadrada real.")
    }
}

package algoritmos.grupo130a139.algoritmo137

import kotlin.math.*

fun main() {
    print("Digite a: ")
    val a = readln().trim().replace(',', '.').toDouble()
    print("Digite b: ")
    val b = readln().trim().replace(',', '.').toDouble()
    print("Digite c: ")
    val c = readln().trim().replace(',', '.').toDouble()
    if (a == 0.0) {
        println("Não é equação do segundo grau")
    } else {
        val delta = b * b - 4 * a * c
        if (delta < 0) println("Não há raízes reais")
        else {
            val x1 = (-b + sqrt(delta)) / (2 * a)
            val x2 = (-b - sqrt(delta)) / (2 * a)
            println("X1: $x1")
            println("X2: $x2")
        }
    }
}

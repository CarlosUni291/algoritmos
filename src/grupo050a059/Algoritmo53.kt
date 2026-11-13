package algoritmos.grupo050a059.algoritmo53

import kotlin.math.*

fun main() {
    print("Digite a: ")
    val a = readln().trim().replace(',', '.').toDouble()
    print("Digite b: ")
    val b = readln().trim().replace(',', '.').toDouble()
    print("Digite c: ")
    val c = readln().trim().replace(',', '.').toDouble()
    val diagonal = sqrt(a * a + b * b + c * c)
    println("Diagonal: $diagonal")
}

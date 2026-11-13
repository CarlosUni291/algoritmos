package algoritmos.grupo050a059.algoritmo59

import kotlin.math.*

fun main() {
    print("Digite cateto1: ")
    val cateto1 = readln().trim().replace(',', '.').toDouble()
    print("Digite cateto2: ")
    val cateto2 = readln().trim().replace(',', '.').toDouble()
    val hipotenusa = sqrt(cateto1 * cateto1 + cateto2 * cateto2)
    println("Hipotenusa: $hipotenusa")
}

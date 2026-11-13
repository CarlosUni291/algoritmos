package algoritmos.grupo040a049.algoritmo43

import kotlin.math.*

fun main() {
    print("Digite numero: ")
    val numero = readln().trim().replace(',', '.').toDouble()
    if (numero <= 0) {
        println("O logaritmando deve ser positivo.")
        return
    }
    println("Logaritmo na base 10: ${ln(numero) / ln(10.0)}")
}

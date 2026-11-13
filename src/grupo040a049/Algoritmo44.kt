package algoritmos.grupo040a049.algoritmo44

import kotlin.math.*

fun main() {
    print("Digite numero: ")
    val numero = readln().trim().replace(',', '.').toDouble()
    print("Digite base: ")
    val base = readln().trim().replace(',', '.').toDouble()
    if (numero <= 0 || base <= 0 || base == 1.0) {
        println("Logaritmo indefinido para os valores informados.")
        return
    }
    println("Logaritmo de $numero na base $base: ${ln(numero) / ln(base)}")
}

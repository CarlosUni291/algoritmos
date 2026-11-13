package algoritmos.grupo040a049.algoritmo42

import kotlin.math.*

fun main() {
    print("Digite angulo: ")
    val angulo = readln().trim().replace(',', '.').toDouble()
    val radianos = angulo * PI / 180
    val seno = sin(radianos)
    val cosseno = cos(radianos)
    println("Seno: $seno")
    println("Cosseno: $cosseno")
    if (abs(cosseno) < 1e-12) {
        println("Tangente: indefinida")
        println("Secante: indefinida")
    } else {
        println("Tangente: ${tan(radianos)}")
        println("Secante: ${1 / cosseno}")
    }
    if (abs(seno) < 1e-12) {
        println("Cossecante: indefinida")
        println("Cotangente: indefinida")
    } else {
        println("Cossecante: ${1 / seno}")
        println("Cotangente: ${cosseno / seno}")
    }
}

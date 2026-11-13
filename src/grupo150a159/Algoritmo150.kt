package algoritmos.grupo150a159.algoritmo150

import kotlin.math.*

fun main() {
    print("Digite angulo: ")
    val angulo = readln().trim().replace(',', '.').toDouble()
    val radianos = angulo * PI / 180
    if ((radianos > PI / 2 && radianos <= PI) || (radianos > 3 * PI / 2 && radianos <= 2 * PI)) {
        println("Seno: ${sin(radianos)}")
    } else {
        println("Cosseno: ${cos(radianos)}")
    }
}

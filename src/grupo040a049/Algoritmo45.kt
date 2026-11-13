package algoritmos.grupo040a049.algoritmo45

import kotlin.math.*

fun main() {
    print("Digite numero: ")
    val numero = readln().trim().replace(',', '.').toDouble()
    val quadrado = numero * numero
    println("Número: $numero")
    println("Quadrado: $quadrado")
    if (numero >= 0) println("Raiz quadrada: ${sqrt(numero)}")
    else println("Raiz quadrada: não existe nos reais")
}
